package com.company.java;

import java.util.HashMap;
import java.util.Map;

public class Test1 {


    public int getNumberByName(String str){

        HashMap<String, Integer> list = new HashMap<>();

        list.put("Ali", 20);
        list.put("Aliza", 30);
        list.put("Dam", 12);

        return list.get(str);

    }

}
