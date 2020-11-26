package com.aliraza.dogs.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "owner")
public class Owner {

    @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Dog> dogs;

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
