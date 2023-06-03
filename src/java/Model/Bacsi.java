/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Bacsi {

    private int doctorID;
    private String email;
    private String pass;
    private String name;
    private String degree;
    private int experience;
    private int specialtyID;
    private String image;
    private String phone;
    private String dob;
    private String gender;
    private String address;
    private String isDoctor;
 

    public Bacsi() {
    }

    public Bacsi(int doctorID, String email, String pass, String name, String degree, int experience, int specialtyID, String image, String phone, String dob, String gender, String address, String isDoctor) {
        this.doctorID = doctorID;
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.degree = degree;
        this.experience = experience;
        this.specialtyID = specialtyID;
        this.image = image;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.isDoctor = isDoctor;
        
    }



    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSpecialtyID() {
        return specialtyID;
    }

    public void setSpecialtyID(int specialtyID) {
        this.specialtyID = specialtyID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(String isDoctor) {
        this.isDoctor = isDoctor;
    }

    @Override
    public String toString() {
        return "Bacsi{" + "doctorID=" + doctorID + ", email=" + email + ", pass=" + pass + ", name=" + name + ", degree=" + degree + ", experience=" + experience + ", specialtyID=" + specialtyID + ", image=" + image + ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", isDoctor=" + isDoctor + '}';
    }

    

}
