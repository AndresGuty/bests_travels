package com.app.bests_travels.domain.repositories;

import com.app.bests_travels.domain.entities.FlyEntity;
import com.app.bests_travels.domain.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, UUID> {

}
