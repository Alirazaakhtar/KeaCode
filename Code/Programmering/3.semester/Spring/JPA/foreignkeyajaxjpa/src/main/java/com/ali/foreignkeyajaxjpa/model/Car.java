package com.ali.foreignkeyajaxjpa.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int model;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @OneToOne
    @JoinColumn(name = "ensurance_id")
    private Ensurence ensurence;


@OneToMany(cascade = CascadeType.ALL, mappedBy = "Car")
    private List<Garage> list;

    public List<Garage> getList() {
        return list;
    }

    public void setList(List<Garage> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
