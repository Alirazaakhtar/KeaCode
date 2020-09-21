package com.qazaapp.qazaapp;

import com.qazaapp.qazaapp.model.Prayer;
import com.qazaapp.qazaapp.repository.IPrayerRepository;
import com.qazaapp.qazaapp.repository.PrayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.SQLException;

@SpringBootApplication
public class QazaappApplication {

	public static void main(String[] args) {

		SpringApplication.run(QazaappApplication.class, args);

	}

}
