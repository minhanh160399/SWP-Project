<%-- 
    Document   : Datlich
    Created on : May 31, 2023, 4:06:41 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

    </head>
    <body>


        <div>
            <label for="image">Ảnh: ${showlich.image}</label>
        </div>
        <div>
            <label for="name">Tên: ${showlich.name}</label>
        </div>
        <div>
            <label for="degree">Trình độ: ${showlich.degree}</label>
        </div>
        <div>
            <label for="speciality">Trình độ: ${showlich.specialization}</label>
        </div>
        <div>
            <label for="experience">Kinh nghiệm: ${showlich.experience}</label>
        </div>

        <h1>Lịch làm việc</h1>
    <head>
        <title>Lịch chọn và khung giờ</title>
        <style>
            .container {
                width: 300px;
                margin: 0 auto;
                padding: 20px;
            }
        </style>
    </head>

    <div class="container">
        <label for="date">Chọn ngày:</label>
        <input type="date" id="date">

        <c:forEach var="lichlamviec" items="${lich}">
            <h3>Ngày: ${lichlamviec.dayOfWeek}</h3>
            <ul>
                <c:forEach var="availability" items="${lichlamviec.doctorAvailabilities}">
                    <li>
                        Từ ${availability.startTime} đến ${availability.endTime}
                        <a href="BookAppointmentServlet?doctorAvailabilityID=${availability.doctorAvailabilityID}">Đặt lịch</a>
                    </li>
                </c:forEach>
            </ul>
        </c:forEach>

        <label for="time">Chọn giờ:</label>
        <input type="time" id="time">
    </div>




</body>
</html>
