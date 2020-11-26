package com.ali.foreignkeyajaxjpa.model;


import javax.persistence.*;

@Entity
@Table(name = "ensurence")
public class Ensurence {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double pris;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ensurence")
    private Car car;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
