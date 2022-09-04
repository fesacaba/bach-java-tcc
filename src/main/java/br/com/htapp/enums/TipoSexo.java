package br.com.htapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoSexo {
    MASCULINO("M"),
    FEMININO("F");

    private String descricao;
}
