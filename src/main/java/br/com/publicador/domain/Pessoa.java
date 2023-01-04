package br.com.cadastro.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {

    private String nome;
    private Integer idade;
    private Endereco endereco;

}
