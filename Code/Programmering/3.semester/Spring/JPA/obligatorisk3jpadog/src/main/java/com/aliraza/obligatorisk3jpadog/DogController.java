package com.aliraza.obligatorisk3jpadog;


import com.aliraza.obligatorisk3jpadog.model.Dog;
import com.aliraza.obligatorisk3jpadog.service.dog.DogServiceJPA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    private DogServiceJPA dogServiceJPA;

    public DogController(DogServiceJPA dogServiceJPA) {
        this.dogServiceJPA = dogServiceJPA;
    }

    @PostMapping("/createdog")
    public ResponseEntity<DogServiceJPA> createDog(@RequestBody Dog dog){




        dogServiceJPA.save(dog);

        return ResponseEntity.ok(dogServiceJPA);
    }
}
