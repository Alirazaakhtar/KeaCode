package com.qazaapp.qazaapp.repository;

import com.qazaapp.qazaapp.model.Prayer;

import java.util.List;

public interface IPrayerRepository {

    public void createQaza(Prayer prayer);

    public Prayer readQaza(int prayer_id);

    public boolean updateQaza(Prayer prayer);

    public boolean deleteQada(int prayer_id);

    public List<Prayer> getAll();



}
