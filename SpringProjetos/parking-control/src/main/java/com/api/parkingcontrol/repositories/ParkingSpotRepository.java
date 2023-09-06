package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

//Não é nescessário anotar o @Repository pois ela extends JpaRepository que já está incluso o @.
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
