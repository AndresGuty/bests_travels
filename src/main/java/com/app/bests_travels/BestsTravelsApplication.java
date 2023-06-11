package com.app.bests_travels;

import com.app.bests_travels.domain.repositories.FlyRepository;
import com.app.bests_travels.domain.repositories.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BestsTravelsApplication /*implements CommandLineRunner*/ {

/*
    @Autowired
    private FlyRepository flyRepository;

    @Autowired
    private HotelRepository hotelRepository;
*/


    public static void main(String[] args) {
        SpringApplication.run(BestsTravelsApplication.class, args);

    }

/*    @Override
    public void run(String... args) throws Exception {
        var fly = flyRepository.findById(15L).get();
        var hotel = hotelRepository.findById(7L).get();
        log.info(String.valueOf(fly));
        log.info((String.valueOf(hotel)));
    }*/
}
