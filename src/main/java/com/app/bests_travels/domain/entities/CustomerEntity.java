package com.app.bests_travels.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "customer")
public class CustomerEntity implements Serializable {

    @Id
    @Column(length = 12)
    private String dni;

    @Column(length = 50, name = "full_name")
    private String fullName;

    @Column(length = 20, name = "credit_card")
    private String creditCard;

    @Column(name = "total_flights")
    private Integer totalFlights;

    @Column(name = "total_lodgings")
    private Integer totalLodgings;

    @Column(name = "total_tours")
    private Integer totalTours;

    @Column(length = 12, name = "phone_number")
    private String phoneNumber;

////////////////////MAPEANDO RELACIONES////////////////////
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<TicketEntity> tickets;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<ReservationEntity> reservations;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<TourEntity> tours;



}
