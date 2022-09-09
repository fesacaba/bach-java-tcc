package br.com.htapp.usecase;

import br.com.htapp.database.entity.event.EventEntity;
import br.com.htapp.database.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EventUsecase {

    @Autowired
    private EventRepository repository;

    public List<EventEntity> findAll() {
        return repository.findAll();
    }
}
