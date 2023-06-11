package com.app.bests_travels.domain.repositories;

import com.app.bests_travels.domain.entities.FlyEntity;
import com.app.bests_travels.domain.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

}
