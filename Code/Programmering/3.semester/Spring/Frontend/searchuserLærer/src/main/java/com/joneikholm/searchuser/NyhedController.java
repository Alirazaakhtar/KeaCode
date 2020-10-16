package com.joneikholm.searchuser;


import com.joneikholm.searchuser.model.Nyhed;
import com.joneikholm.searchuser.service.Nyheder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NyhedController {

    Nyheder nyheder = new Nyheder(); // database



    @PostMapping("api/nyheder")
    public ResponseEntity<Nyheder> getNyhedResult(){

        System.out.println("api/nyheder kaldet med ");


        return ResponseEntity.ok(nyheder);

    }


    @PostMapping("api/opretnyheder")
    public ResponseEntity<Nyheder> opretNyheder(@RequestBody Nyhed nyhed){

        nyheder.tilfoejNyhed(nyhed.nyheden);

        System.out.println("api/nyheder kaldet med " + nyhed.nyheden);



        return ResponseEntity.ok(nyheder);

    }



}
