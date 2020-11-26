package com.akhtar.jpahibernatedemo.model;


import javax.persistence.*;

@Entity // betyder at hibernate kan bruge denne klasse til at lave tabeller med
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // fortæller databasen at id skal være auto increment
    private long id;

    //@Column(name = "first_name") // måske kan man gør det uden ? kan man godt :)
    private String firstName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
