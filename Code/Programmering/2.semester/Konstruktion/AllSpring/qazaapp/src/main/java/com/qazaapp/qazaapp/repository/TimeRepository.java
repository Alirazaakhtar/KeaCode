package com.qazaapp.qazaapp.repository;

import com.qazaapp.qazaapp.model.LastTime;
import com.qazaapp.qazaapp.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimeRepository implements ILastTimeRepository {


    private Connection conn;


    public TimeRepository() {
        this.conn = DatabaseConnectionManager.getConnection();
    }

    @Override
    public void createTime(LastTime lastTime) {

        PreparedStatement prepared = null;
        int prayer_id = 0;
        try {

            PreparedStatement prepared1 = conn.prepareStatement("SELECT * from prayers");

            ResultSet rs = prepared1.executeQuery();

            while (rs.next()){
                prayer_id = rs.getInt(1);
            }

            prepared = conn.prepareStatement("INSERT INTO lastUpdated(prayer_id, last_time, dato) VALUES (?,?,?)");

            prepared.setInt(1, prayer_id);
            prepared.setString(2, lastTime.getTime());
            prepared.setString(3, lastTime.getDate());

            prepared.executeUpdate();

            System.out.println("time success");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public LastTime getLastTime(int time_id) {
        return null;
    }

    @Override
    public boolean updateTime(LastTime lastTime) {
        return false;
    }

    @Override
    public boolean deleteTime(int time_id) {
        return false;
    }
}
