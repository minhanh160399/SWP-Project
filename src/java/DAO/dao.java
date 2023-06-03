package DAO;

import Model.Bacsi;
import Model.Bacsicosan;

import Model.Camnang;
import Model.Chuyenkhoa;
import Model.Lichlamviec;
import Model.Patient;

import contact.ContactDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class dao {

    private final ArrayList<Bacsi> result = new ArrayList<>();
    private final ArrayList<Chuyenkhoa> resultc = new ArrayList<>();
    private final ArrayList<Camnang> resultcn = new ArrayList<>();
    private final ArrayList<Lichlamviec> resultlich = new ArrayList<>();
    private final ArrayList<Patient> resultp = new  ArrayList<>();
    Connection con = null;
    PreparedStatement p1 = null;
    ResultSet re = null;

    public ArrayList<Bacsi> getTop3() throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "Select * from Doctor where Experience = 10;";

            p1 = con.prepareStatement(stm1);

            re = p1.executeQuery();
            while (re.next()) {
                  result.add(new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), 
                       re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                       re.getString(12), re.getString(13)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public ArrayList<Bacsi> getAll() throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "SELECT * FROM Doctor";

            p1 = con.prepareStatement(stm1);

            re = p1.executeQuery();
            while (re.next()) {
               result.add(new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), 
                       re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                       re.getString(12), re.getString(13)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public ArrayList<Bacsi> search(String txtSearch) throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "SELECT * FROM Doctor WHERE DoctorName LIKE ? OR Degree LIKE ? OR Specialization LIKE ?";
           
            p1 = con.prepareStatement(stm1);
            p1.setString(1, "%" + txtSearch + "%");
            p1.setString(2, "%" + txtSearch + "%");
            p1.setString(3, "%" + txtSearch + "%");
            re = p1.executeQuery();
            while (re.next()) {
                result.add(new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), 
                       re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                       re.getString(12), re.getString(13)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public ArrayList<Chuyenkhoa> getSpecialty() throws ClassNotFoundException {
        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "select *from Specialty;";

            p1 = con.prepareStatement(stm1);

            re = p1.executeQuery();
            while (re.next()) {
                resultc.add(new Chuyenkhoa(re.getInt(1), re.getString(2)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return resultc;

    }

    public ArrayList<Bacsi> getDoctorbySpecialtyID(String cid) throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "select * from Doctor\n"
                    + "where SpecialtyID = ?";

            p1 = con.prepareStatement(stm1);
            p1.setString(1, cid);
            re = p1.executeQuery();
            while (re.next()) {
                  result.add(new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), 
                       re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                       re.getString(12), re.getString(13)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }

    public Camnang getBlogByID(String bid) throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "SELECT * FROM Blog where BlogID = ?";

            p1 = con.prepareStatement(stm1);
            p1.setString(1, bid);
            re = p1.executeQuery();
            while (re.next()) {
                return new Camnang(re.getInt(1), re.getInt(2), re.getString(3), re.getString(4), re.getString(5),
                        re.getString(6), re.getString(7));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public ArrayList<Camnang> getAllBlog() throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "select * from Blog;";

            p1 = con.prepareStatement(stm1);
            re = p1.executeQuery();
            while (re.next()) {
                resultcn.add(new Camnang(re.getInt(1), re.getInt(2), re.getString(3), re.getString(4), re.getString(5),
                        re.getString(6), re.getString(7)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return resultcn;
    }

    public ArrayList<Camnang> searchBlog(String txtSearch) throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "SELECT * FROM Blog WHERE [Day] LIKE ? OR [Month] LIKE ? OR Title LIKE ? OR ScriptShort LIKE ?";

            p1 = con.prepareStatement(stm1);
            p1.setString(1, "%" + txtSearch + "%");
            p1.setString(2, "%" + txtSearch + "%");
            p1.setString(3, "%" + txtSearch + "%");
            p1.setString(4, "%" + txtSearch + "%");
            re = p1.executeQuery();
            while (re.next()) {
                resultcn.add(new Camnang(re.getInt(1), re.getInt(2), re.getString(3), re.getString(4), re.getString(5),
                        re.getString(6), re.getString(7)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return resultcn;
    }

    public Bacsi getDoctorbyID(String lid) throws ClassNotFoundException {
//         con = null;

        try {
            this.con = ContactDB.makeConnection();

            String stm1 = "select * from Doctor\n"
                    + "where DoctorID = ?";
            p1 = con.prepareStatement(stm1);
            p1.setString(1, lid);
            re = p1.executeQuery();
            while (re.next()) {
               result.add(new Bacsi(re.getInt(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), 
                       re.getInt(6), re.getInt(7), re.getString(8), re.getString(9), re.getString(10), re.getString(11),
                       re.getString(12), re.getString(13)));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public ArrayList<Lichlamviec> getDoctorWorkSchedule(String doctorID) throws ClassNotFoundException {

        try {
            Connection con = ContactDB.makeConnection();
            // Truy vấn cơ sở dữ liệu để lấy lịch làm việc của bác sĩ
            String stm1 = "SELECT ws.WorkScheduleID, ws.DayOfWeek, da.StartTime, da.EndTime "
                    + "FROM WorkSchedule ws "
                    + "INNER JOIN DoctorAvailability da ON ws.WorkScheduleID = da.WorkScheduleID "
                    + "WHERE ws.DoctorID = ? "
                    + "ORDER BY ws.DayOfWeek, da.StartTime";

            p1 = con.prepareStatement(stm1);
            p1.setString(1, doctorID);
            re = p1.executeQuery();

            int currentWorkScheduleID = 0;
            Lichlamviec lichlamviec = null;

            while (re.next()) {
                int workScheduleID = re.getInt("WorkScheduleID");
                LocalDate dayOfWeek = re.getDate("DayOfWeek").toLocalDate();
                LocalTime startTime = re.getTime("StartTime").toLocalTime();
                LocalTime endTime = re.getTime("EndTime").toLocalTime();

                if (workScheduleID != currentWorkScheduleID) {
                    // Tạo một đối tượng Lichlamviec mới nếu WorkScheduleID thay đổi
                    lichlamviec = new Lichlamviec(workScheduleID, dayOfWeek);
                    resultlich.add(lichlamviec);
                    currentWorkScheduleID = workScheduleID;
                }

                // Thêm thông tin DoctorAvailability vào Lichlamviec
                lichlamviec.addDoctorAvailability(new Bacsicosan(startTime, endTime));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultlich;
    }
     public ArrayList<Patient> getPatientId(String id) {
        String stm1 = "select * from Patient where PatientID = ?";

        try {
            this.con = ContactDB.makeConnection();
            p1 = con.prepareStatement(stm1);
            p1.setString(1, id);
            re = p1.executeQuery();
            while (re.next()) {
              resultp.add( new Patient(re.getInt(1), re.getString(2), re.getString(3), re.getString(4),
                        re.getString(5), re.getString(6), re.getString(7), re.getString(8), re.getString(9)));

            }
        } catch (Exception e) {
        }

        return resultp;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        dao DAO = new dao();
        List<Bacsi> a = DAO.getAll();
        System.out.println(a);
    }
}
