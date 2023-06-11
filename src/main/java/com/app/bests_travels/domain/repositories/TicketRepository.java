package com.app.bests_travels.domain.repositories;

import com.app.bests_travels.domain.entities.FlyEntity;
import com.app.bests_travels.domain.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long> {

}
