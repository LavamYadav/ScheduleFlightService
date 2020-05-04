package com.schedule.repository;
import org.springframework.data.repository.CrudRepository;

import com.schedule.dto.Flight;

//repository that extends CrudRepository
public interface FlightRepository extends CrudRepository<Flight, Integer>
{


}
