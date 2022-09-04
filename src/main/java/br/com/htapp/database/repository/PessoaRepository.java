package br.com.htapp.database.repository;

import br.com.htapp.database.entity.pessoa.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    PessoaEntity findByEmail(String email);
}
