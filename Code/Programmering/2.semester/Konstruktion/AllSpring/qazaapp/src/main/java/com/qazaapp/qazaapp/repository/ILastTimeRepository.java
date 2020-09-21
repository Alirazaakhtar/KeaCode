package com.qazaapp.qazaapp.repository;

import com.qazaapp.qazaapp.model.LastTime;
import com.qazaapp.qazaapp.model.Prayer;

public interface ILastTimeRepository {

    public void createTime(LastTime lastTime);

    public LastTime getLastTime(int time_id);

    public boolean updateTime(LastTime lastTime);

    public boolean deleteTime(int time_id);
}
