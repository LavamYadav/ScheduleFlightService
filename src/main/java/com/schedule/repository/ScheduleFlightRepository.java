package com.schedule.repository;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
	import com.schedule.dto.ScheduleFlight;
	public interface ScheduleFlightRepository extends CrudRepository<ScheduleFlight,Integer>
	{
	}



