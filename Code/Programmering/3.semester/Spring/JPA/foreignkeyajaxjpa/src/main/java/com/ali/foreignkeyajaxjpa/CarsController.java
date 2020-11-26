package com.ali.foreignkeyajaxjpa;


import com.ali.foreignkeyajaxjpa.model.Car;
import com.ali.foreignkeyajaxjpa.service.CarServiceJpa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarsController {

    private CarServiceJpa carServiceJpa;

    public CarsController(CarServiceJpa carServiceJpa) {
        this.carServiceJpa = carServiceJpa;
    }

    @PostMapping("/create")
    public ResponseEntity<CarServiceJpa> create(@RequestBody Car car){

        carServiceJpa.save(car);
        System.out.println("created");

        return ResponseEntity.ok(carServiceJpa);
    }

    @PostMapping("/get")
    ResponseEntity<CarServiceJpa> getCars(){

        System.out.println("getCars kaldt");


        return ResponseEntity.ok(carServiceJpa);
    }
}
