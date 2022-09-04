package br.com.htapp.database.entity.pessoa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NM_NOME")
    private String nome;

    @Column(name = "NM_EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "PASSWORD")
    private String password;
}