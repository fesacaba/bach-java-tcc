package br.com.htapp.usecase;

import br.com.htapp.database.entity.pessoa.PessoaEntity;
import br.com.htapp.database.repository.PessoaRepository;
import br.com.htapp.exception.LoginFailException;
import br.com.htapp.exception.PessoaJaCadastradaException;
import br.com.htapp.http.domain.AuthDTO;
import br.com.htapp.http.domain.PessoaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PessoaUsecase {

    @Autowired
    private PessoaRepository repository;

    public void save(PessoaDTO dto) {
        try {
            repository.save(
                    PessoaEntity
                            .builder()
                            .nome(dto.getNome())
                            .password(dto.getPassword())
                            .email(dto.getEmail())
                            .telefone(dto.getPhone())
                            .build()
            );
        } catch (DataIntegrityViolationException e) {
            throw new PessoaJaCadastradaException();
        }
    }



    public PessoaEntity findPessoaPorUsuarioESenha(AuthDTO dto) {
        PessoaEntity entity;
        try {
            entity = repository.findByEmail(dto.getEmail());

        } catch (Exception e) {
            throw new LoginFailException();
        }

        if (entity == null) {
            throw new LoginFailException();
        }

        if (!dto.getPassword().equals(entity.getPassword())) {
            throw new LoginFailException();
        }

        if (!dto.getEmail().equals(entity.getEmail())) {
            throw new LoginFailException();
        }
        return entity;
    }
}
