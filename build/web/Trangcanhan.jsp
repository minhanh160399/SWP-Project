<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="assets/css/css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang cá nhân</title>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/profile.css">
    </head>
    <body>
        <div class="container rounded bg-white mt-5 mb-5">
            <div class="row">
                <div class="col-md-3 border-right">
                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle " width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold"></span><span class="text-black-50"></span><span> </span></div>
                    <div class="profile-info">
                        <h5>${patients.name}</h5>
                        <p>${patients.id}</p>
                    </div>
                    <br>
                    <div id="links">
                        <a href="showpatients"><i class="fas fa-user"></i> Trang cá nhân</a> <br>
                        <a href=""><i class="fas fa-history"></i> Lịch sử khám bệnh</a> <br>
                        <a href="chinh-sua"><i class="fas fa-edit"></i> Sửa đổi thông tin</a> <br>
                        <a href=""><i class="fas fa-key"></i> Thay đổi mật khẩu</a> <br>
                        <a href=""><i class="fas fa-star-half-alt"></i> Đánh giá bác sĩ</a> <br>
                        <a href=""><i class="fas fa-sign-out-alt"></i> Thoát</a>
                    </div>
                </div>

                <div class="col-md-8 border-right">
                    <form action="chinh-sua" method="post">
                        <div class="p-3 py-5">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <h4 class="text-right">Trang cá nhân</h4>
                            </div>

                            <div class="row mt-3">
                                <div class="col-md-12">
                                 
                                        <label class="labels">Họ và tên</label>
                                        <input value = "${sessionScope.acc.name}"  type="text" class="form-control" name="name">
                                    </div>

                                    <div class="col-md-12">
                                        <label class="labels">Ngày sinh</label>
                                        <input value = "${sessionScope.acc.dob}" type="date" class="form-control" name="DOB">
                                    </div>

                                    <div class="col-md-12">
                                        <label class="labels">Giới tính</label>
                                        <c:if test="${sessionScope.acc.gender == 1}">
                                            <input value = "Nam"  type="text" class="form-control" name="gender">
                                        </c:if>
                                        <c:if test="${sessionScope.acc.gender == 0}">
                                           <input value = "Nữ"  type="text" class="form-control" name="gender">
                                        </c:if>                
                                    </div>

                                    <div class="col-md-12">
                                        <label class="labels">Địa chỉ</label>
                                        <input value = "${sessionScope.acc.address}"  type="text" class="form-control" name="address">
                                    </div>
                                    <div class="col-md-12">
                                        <label class="labels">Email</label>
                                        <input value = "${sessionScope.acc.email}" type="text" class="form-control" name="email">
                                    </div>

                                    <div class="col-md-12">
                                        <label class="labels">Số điện thoại</label>
                                        <input value = "${sessionScope.acc.phone}" type="number" class="form-control" name="phone">
                                    </div>
                                
                            </div>

                        </div>
                    </form>
                </div>
                <div class="col-md-4">
                    <div class="p-3 py-5">

                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>


