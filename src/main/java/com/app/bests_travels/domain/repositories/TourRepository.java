package com.app.bests_travels.domain.repositories;

import com.app.bests_travels.domain.entities.FlyEntity;
import com.app.bests_travels.domain.entities.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<TourEntity, Long> {

}
