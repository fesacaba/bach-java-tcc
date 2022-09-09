package br.com.htapp.http.v1;

import br.com.htapp.database.entity.event.EventEntity;
import br.com.htapp.http.domain.PessoaDTO;
import br.com.htapp.usecase.EventUsecase;
import br.com.htapp.usecase.PessoaUsecase;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/event")
@Api(tags = "Eventos", produces = APPLICATION_JSON_VALUE)
@CrossOrigin
public class EventController {

    @Autowired
    private EventUsecase usecase;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EventEntity> findAll() {
        return usecase.findAll();
    }
}
