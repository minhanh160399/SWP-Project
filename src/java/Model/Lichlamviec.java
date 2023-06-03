package Model;

import Model.Bacsicosan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lichlamviec {
    private int workScheduleID;
    private LocalDate dayOfWeek;
    private List<Bacsicosan> doctorAvailabilities;

    public Lichlamviec() {
        doctorAvailabilities = new ArrayList<>();
    }
    

    public Lichlamviec(int workScheduleID, LocalDate dayOfWeek) {
        this.workScheduleID = workScheduleID;
        this.dayOfWeek = dayOfWeek;
        doctorAvailabilities = new ArrayList<>();
    }

    public int getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(int workScheduleID) {
        this.workScheduleID = workScheduleID;
    }

    public LocalDate getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(LocalDate dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<Bacsicosan> getDoctorAvailabilities() {
        return doctorAvailabilities;
    }

    public void setDoctorAvailabilities(List<Bacsicosan> doctorAvailabilities) {
        this.doctorAvailabilities = doctorAvailabilities;
    }

    public void addDoctorAvailability(Bacsicosan availability) {
        doctorAvailabilities.add(availability);
    }

    @Override
    public String toString() {
        return "Lichlamviec{" +
                "workScheduleID=" + workScheduleID +
                ", dayOfWeek=" + dayOfWeek +
                ", doctorAvailabilities=" + doctorAvailabilities +
                '}';
    }
}
