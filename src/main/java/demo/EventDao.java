package demo;

import org.springframework.data.repository.CrudRepository;

public interface EventDao extends CrudRepository<Event, Long> {
}