package br.com.htapp.config;

import br.com.htapp.exception.LoginFailException;
import br.com.htapp.exception.PessoaJaCadastradaException;
import br.com.htapp.http.domain.DefaultError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestController
@ControllerAdvice
public class Handler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = PessoaJaCadastradaException.class)
    public ResponseEntity<DefaultError> pessoaJaCadastradaException() {
        return ResponseEntity.badRequest().body(
                DefaultError
                        .builder()
                        .status("CPF JA CADASTRADO NA BASE DE DADOS")
                        .build()
        );
    }
    @ExceptionHandler(value = LoginFailException.class)
    public ResponseEntity<DefaultError> loginFailException() {
        return ResponseEntity.badRequest().body(
                DefaultError
                        .builder()
                        .status("Login invalido")
                        .build()
        );
    }
}
