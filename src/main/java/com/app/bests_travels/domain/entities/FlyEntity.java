package com.app.bests_travels.domain.entities;


import com.app.bests_travels.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "fly")
public class FlyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origin_lat")
     private double originLat;

    @Column(name = "origin_lng")
     private double originLng;

    @Column(name = "destiny_lng")
    private double destinyLng;

    @Column(name = "destiny_lat")
    private double destinyLat;

    private BigDecimal price;

    @Column(length = 20, name = "origin_name")
    private String origin_name;

    @Column(length = 20, name = "destiny_name")
    private  String destiny_name;

    @Column(length = 20, name="aero_line")
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;


}
