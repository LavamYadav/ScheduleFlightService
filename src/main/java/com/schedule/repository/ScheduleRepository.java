package com.schedule.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.schedule.dto.Schedule;
public interface ScheduleRepository extends CrudRepository<Schedule,Integer>
{
}
