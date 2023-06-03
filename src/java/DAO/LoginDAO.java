/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Bacsi;
import Model.Patient;
import contact.ContactDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class LoginDAO {

    Connection con = null;
    PreparedStatement p1 = null;
    ResultSet re = null;

    public Patient loginPatient(String email, String pass) {
        String stm1 = "SELECT * FROM Patient\n"
                + "WHERE email = ?\n"
                + "AND pass = ?";

        try {
            this.con = ContactDB.makeConnection();
            p1 = con.prepareStatement(stm1);
            p1.setString(1, email);
            p1.setString(2, pass);
            re = p1.executeQuery();
            while (re.next()) {
                return new Patient(re.getInt(1), re.getString(2), re.getString(3), re.getString(4),
                        re.getString(5), re.getString(6), re.getString(7), re.getString(8), re.getString(9));

            }
        } catch (Exception e) {
        }

        return null;
    }

    public Bacsi loginDoctor(String email, String pass) {
        String stm1 = "SELECT * FROM Doctor\n"
                + "WHERE email = ?\n"
                + "AND pass = ?";

        try {
            this.con = ContactDB.makeConnection();
            p1 = con.prepareStatement(stm1);
            p1.setString(1, email);
            p1.setString(2, pass);
            re = p1.executeQuery();
            while (re.next()) {
                return (new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5),
                        re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                        re.getString(12), re.getString(13)));

            }
        } catch (Exception e) {
        }

        return null;
    }

    public Patient checkAccountExist(String email) {
        String stm1 = "select * from Patient where email = ?";

        try {
            this.con = ContactDB.makeConnection();
            p1 = con.prepareStatement(stm1);
            p1.setString(1, email);
            re = p1.executeQuery();
            while (re.next()) {
                return new Patient(re.getInt(1), re.getString(2), re.getString(3), re.getString(4),
                        re.getString(5), re.getString(6), re.getString(7), re.getString(8), re.getString(9));

            }
        } catch (Exception e) {
        }

        return null;
    }

    public void signup(String email, String pass, String name, String phone, String dob, Boolean gender, String address) {
        String stm1 = "INSERT INTO Patient (email, pass, [name], phoneNumber, dob, gender, address, isAdmin) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, 0)";

        try {
            this.con = ContactDB.makeConnection();
            PreparedStatement p1 = con.prepareStatement(stm1);
            p1.setString(1, email);
            p1.setString(2, pass);
            p1.setString(3, name);
            p1.setString(4, phone);
            p1.setString(5, dob);
            p1.setBoolean(6, gender);
            p1.setString(7, address);
            p1.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoginDAO dao = new LoginDAO();
   

     
    }

}
