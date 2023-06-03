package Model;

import java.time.LocalTime;

public class Bacsicosan {
    private LocalTime startTime;
    private LocalTime endTime;

    public Bacsicosan() {
    }

    public Bacsicosan(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Bacsicosan{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
