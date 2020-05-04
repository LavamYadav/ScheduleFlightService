package com.schedule.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository

import com.schedule.dto.Airport;

public interface AirportRepository extends CrudRepository<Airport, String>
{
}
