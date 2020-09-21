package com.qazaapp.qazaapp.repository;

import com.qazaapp.qazaapp.model.Prayer;
import com.qazaapp.qazaapp.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrayerRepository implements IPrayerRepository {


    private Connection conn;


    public PrayerRepository() {

        this.conn = DatabaseConnectionManager.getConnection();

    }

    @Override
    public void createQaza(Prayer prayer) {

        try{
            PreparedStatement prepared = conn.prepareStatement("Insert into prayers(fajr, zuhr, ashr, maghrib, isha) values(?, ?, ?, ?, ?)");
            prepared.setInt(1, prayer.getFajr());
            prepared.setInt(2, prayer.getZuhr());
            prepared.setInt(3, prayer.getAshr());
            prepared.setInt(4, prayer.getMaghrib());
            prepared.setInt(5, prayer.getIsha());

            prepared.executeUpdate();

            System.out.println("created");

        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Prayer readQaza(int prayer_id) {

        Prayer prayer = new Prayer();
        try {
            PreparedStatement pre = conn.prepareStatement("SELECT * from prayers where prayer_id = ?");
            pre.setInt(1, prayer_id);

            ResultSet resultSet = pre.executeQuery();

            while (resultSet.next()){
                prayer.setPrayer_id(resultSet.getInt(1));
                prayer.setFajr(resultSet.getInt(2));
                prayer.setZuhr(resultSet.getInt(3));
                prayer.setAshr(resultSet.getInt(4));
                prayer.setMaghrib(resultSet.getInt(5));
                prayer.setIsha(resultSet.getInt(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return prayer;
    }

    @Override
    public boolean updateQaza(Prayer prayer) {


        try {
            PreparedStatement pre = conn.prepareStatement("UPDATE prayers SET fajr = ?, zuhr = ?, ashr = ?, maghrib = ?, isha = ? where prayer_id = ?");
            pre.setInt(1, prayer.getFajr());
            pre.setInt(2, prayer.getZuhr());
            pre.setInt(3, prayer.getAshr());
            pre.setInt(4, prayer.getMaghrib());
            pre.setInt(5, prayer.getIsha());
            pre.setInt(6, prayer.getPrayer_id());

            pre.executeUpdate();

            return true;

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteQada(int prayer_id) {
        return false;
    }

    @Override
    public List<Prayer> getAll() {

        List<Prayer> list = new ArrayList<>();

        try {
            PreparedStatement pre = conn.prepareStatement("SELECT * from prayers");
            ResultSet r = pre.executeQuery();

            while (r.next()){
                Prayer prayer = new Prayer();

                prayer.setPrayer_id(r.getInt(1));
                prayer.setFajr(r.getInt(2));
                prayer.setZuhr(r.getInt(3));
                prayer.setAshr(r.getInt(4));
                prayer.setMaghrib(r.getInt(5));
                prayer.setIsha(r.getInt(6));

                list.add(prayer);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }
}
