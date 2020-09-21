package com.qazaapp.qazaapp.model;

public class Prayer {

    private  int prayer_id;
    private int fajr;
    private int zuhr;
    private int ashr;
    private int maghrib;
    private int isha;

    public Prayer(int prayer_id, int fajr, int zuhr, int ashr, int maghrib, int isha) {
        this.prayer_id = prayer_id;
        this.fajr = fajr;
        this.zuhr = zuhr;
        this.ashr = ashr;
        this.maghrib = maghrib;
        this.isha = isha;
    }

    public Prayer(){

    }


    public int getPrayer_id() {
        return prayer_id;
    }

    public void setPrayer_id(int prayer_id) {
        this.prayer_id = prayer_id;
    }


    public int getFajr() {
        return fajr;
    }

    public void setFajr(int fajr) {
        this.fajr = fajr;
    }

    public int getZuhr() {
        return zuhr;
    }

    public void setZuhr(int zuhr) {
        this.zuhr = zuhr;
    }

    public int getAshr() {
        return ashr;
    }

    public void setAshr(int ashr) {
        this.ashr = ashr;
    }

    public int getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(int maghrib) {
        this.maghrib = maghrib;
    }

    public int getIsha() {
        return isha;
    }

    public void setIsha(int isha) {
        this.isha = isha;
    }

    @Override
    public String toString() {
        return "Prayer{" +
                "prayer_id=" + prayer_id +
                ", fajr=" + fajr +
                ", zuhr=" + zuhr +
                ", ashr=" + ashr +
                ", maghrib=" + maghrib +
                ", isha=" + isha +
                '}';
    }
}
