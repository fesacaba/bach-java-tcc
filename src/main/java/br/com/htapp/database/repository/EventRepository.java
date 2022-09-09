package br.com.htapp.database.repository;

import br.com.htapp.database.entity.event.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

}
