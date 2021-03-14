package com.aliraza.obligatorisk3jpadog;


import com.aliraza.obligatorisk3jpadog.model.Owner;
import com.aliraza.obligatorisk3jpadog.service.owner.OwnerServiceJPA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {


    private OwnerServiceJPA ownerServiceJPA;


    public OwnerController(OwnerServiceJPA ownerServiceJPA) {
        this.ownerServiceJPA = ownerServiceJPA;
    }


    @PostMapping("createowner")
    public ResponseEntity<OwnerServiceJPA> createOwner(@RequestBody Owner owner){


        ownerServiceJPA.save(owner);



        return ResponseEntity.ok(ownerServiceJPA);
    }

    @PostMapping("getowners")
    public ResponseEntity<OwnerServiceJPA> getOwners(){


        ownerServiceJPA.owners = ownerServiceJPA.findAll();

        ownerServi

        return ResponseEntity.ok(ownerServiceJPA);
    }
}
