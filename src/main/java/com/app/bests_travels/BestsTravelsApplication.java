package com.app.bests_travels;

import com.app.bests_travels.domain.entities.HotelEntity;
import com.app.bests_travels.domain.entities.ReservationEntity;
import com.app.bests_travels.domain.entities.TicketEntity;
import com.app.bests_travels.domain.entities.TourEntity;
import com.app.bests_travels.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class BestsTravelsApplication implements CommandLineRunner {


    private final FlyRepository flyRepository;
    private final HotelRepository hotelRepository;

    private final TourRepository tourRepository;

    private final TicketRepository ticketRepository;

    private final ReservationRepository reservationRepository;

    private final CustomerRepository customerRepository;


    public BestsTravelsApplication(FlyRepository flyRepository, HotelRepository hotelRepository,
                                   TourRepository tourRepository, TicketRepository ticketRepository,
                                   ReservationRepository reservationRepository, CustomerRepository customerRepository)
    {

        this.flyRepository = flyRepository;
        this.hotelRepository = hotelRepository;
        this.tourRepository = tourRepository;
        this.ticketRepository = ticketRepository;
        this.reservationRepository = reservationRepository;
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BestsTravelsApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
/*
        var fly = flyRepository.findById(10L).get();
        var hotel = hotelRepository.findById(7L).get();
        var ticket = ticketRepository.findById(UUID.fromString("32345678-1234-5678-4234-567812345678"));
        var reservation = reservationRepository.findById(UUID.fromString("22345678-1234-5678-1234-567812345678"));
        var  customer = customerRepository.findById("BBMB771012HMCRR022");
        log.info(String.valueOf(fly));
        log.info(String.valueOf(hotel));
        log.info(String.valueOf(ticket));
        log.info(String.valueOf(reservation));
        log.info(String.valueOf(customer));
*/
        /*this.flyRepository.selectLessPrice(BigDecimal.valueOf(20)).forEach(System.out::println);
        this.flyRepository.selectBetweenPrice(BigDecimal.valueOf(5), BigDecimal.valueOf(20)).forEach(System.out::println);
        this.flyRepository.selectOriginAndDestiny("Grecia","Mexico").forEach(System.out::println);
        */
    /*    var fly = flyRepository.findById(1L);

        System.out.println("fly = " + fly);*/

   /*     var fly = flyRepository.findByTicketsId(UUID.fromString("12345678-1234-5678-2236-567812345678"));

        System.out.println(fly);*/

       /* hotelRepository.findByPriceLessThan(BigDecimal.valueOf(50)).forEach(System.out::println);*/
 /*       Optional<HotelEntity> hotell = hotelRepository.findById(7L);
        System.out.println("hotell = " + hotell);*/

//        hotelRepository.findByPriceIsBetween(BigDecimal.valueOf(5), BigDecimal.valueOf(20)).forEach(System.out::println);

        /*hotelRepository.findByRatingGreaterThan(3).forEach(System.out::println);*/

        //var hotel = hotelRepository.findByReservationId(UUID.fromString("12345678-1234-5678-1234-567812345678"));

        var customer = customerRepository.findById("GOTW771012HMRGR087").orElseThrow();
        log.info("Cliente name: " + customer.getFullName());

        var fly = flyRepository.findById(11L).orElseThrow();

        var hotel = hotelRepository.findById(3L).orElseThrow();
        log.info("Hotel: " + hotel.getName());

        log.info("Vuelo: " + fly.getOrigin_name()+ " - " + fly.getDestiny_name());

        var tour = TourEntity.builder()
                .customer(customer).build();


        var ticket =  TicketEntity.builder()
                .id(UUID.randomUUID())
                .price(fly.getPrice().multiply(BigDecimal.TEN))
                .arrivalDate(LocalDateTime.now())
                .departureDate(LocalDateTime.now())
                .purchaseDate(LocalDateTime.now())
                .customer(customer)
                .tour(tour)
                .fly(fly)
                .build();

        var resevation = ReservationEntity.builder()
                .id(UUID.randomUUID())
                .dateTimeReservation(LocalDateTime.now())
                .dateEnd(LocalDateTime.now().plusDays(2))
                .dateStart(LocalDateTime.now().plusDays(1))
                .hotel(hotel)
                .customer(customer)
                .tour(tour)
                .totalDays(2)
                .price(hotel.getPrice().multiply(BigDecimal.TEN))
                .build();


    }
}
