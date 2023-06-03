/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ASUS
 */
public class Matkhaumoi extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String newPassword = request.getParameter("newpass");
        String confPassword = request.getParameter("confPassword");
        RequestDispatcher dispatcher = null;
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$";
        if (!newPassword.matches(passwordRegex)) {
            request.setAttribute("mess5", "Mật khẩu phải có 8-16 kí tự, bao gồm ít nhất một chữ hoa, một chữ thường và một số!");
            request.getRequestDispatcher("Matkhaumoi.jsp").forward(request, response);
        } else if (!newPassword.equals(confPassword)) {
            request.setAttribute("mess4", "Mật khẩu không trùng khớp!");
            request.getRequestDispatcher("Matkhaumoi.jsp").forward(request, response);
        } else {

            try {
                String serverName = "LAPTOP-JG837OIA";
                String databaseName = "SWP391";
                String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName + ";encrypt=false";
                String username = "sa";
                String password = "sa";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = (Connection) DriverManager.getConnection(url, username, password);
                PreparedStatement pst = con.prepareStatement("update Patient set pass = ? where email = ? ");
                PreparedStatement pst1 = con.prepareStatement("update Doctor set pass = ? where email = ? ");
                pst.setString(1, newPassword);
                pst.setString(2, (String) session.getAttribute("email"));
                pst1.setString(1, newPassword);
                pst1.setString(2, (String) session.getAttribute("email"));

                int rowCount = pst.executeUpdate();
                int rowCount1 = pst1.executeUpdate();
                if (rowCount > 0 || rowCount1 > 0) {
                    request.setAttribute("mess2", "Đổi thành công");
                    dispatcher = request.getRequestDispatcher("Login.jsp");
                } else {
                    request.setAttribute("mess1", "Đổi thất bại");
                    dispatcher = request.getRequestDispatcher("Login.jsp");
                }
                dispatcher.forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
