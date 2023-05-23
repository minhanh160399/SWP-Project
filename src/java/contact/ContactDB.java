package contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ContactDB {
    public static Connection makeConnection() throws ClassNotFoundException {

        try {
            String serverName = "LAPTOP-JG837OIA";
            String databaseName = "SWP391";
            String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName + ";encrypt=false";
            String username = "sa";
            String password = "sa";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = (Connection) DriverManager.getConnection(url, username, password);
            return con;
        } catch (SQLException e) {
            e.getMessage();
            return null;

        }

    }   
     public static void main(String[] args) {
        try {
            Connection connection = ContactDB.makeConnection();
            if (connection != null) {
                System.out.println("Kết nối thành công!");
                connection.close();
            } else {
                System.out.println("Kết nối thất bại!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver!");
        } catch (SQLException e) {
            System.out.println("Lỗi khi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }
}