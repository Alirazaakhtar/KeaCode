package com.joneikholm.searchuser.service;

import com.joneikholm.searchuser.model.Nyhed;

import java.util.ArrayList;
import java.util.List;

public class Nyheder {

    public List<Nyhed> nyheder = new ArrayList<>();


    public Nyheder() {

        opretDemoNyheder();
    }


    public void opretDemoNyheder() {

        nyheder.add(new Nyhed("godt vejr idag"));

        nyheder.add(new Nyhed("Ajax fuld påå"));
    }


    public void tilfoejNyhed(String s){
        Nyhed nyhed = new Nyhed(s);
        nyheder.add(nyhed);



    }
}
