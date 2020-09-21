package com.qazaapp.qazaapp.model;

public class LastTime {

    private int time_id;
    private int prayer_id;
    private String time;
    private String date;

    public LastTime() {
    }


    public LastTime(int time_id, int prayer_id, String time, String date) {
        this.time_id = time_id;
        this.prayer_id = prayer_id;
        this.time = time;
        this.date = date;
    }

    public int getTime_id() {
        return time_id;
    }

    public void setTime_id(int time_id) {
        this.time_id = time_id;
    }

    public int getPrayer_id() {
        return prayer_id;
    }

    public void setPrayer_id(int prayer_id) {
        this.prayer_id = prayer_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Time{" +
                "time_id=" + time_id +
                ", prayer_id=" + prayer_id +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
