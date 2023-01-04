package br.com.aplicacao2.service;

import br.com.aplicacao2.domain.Pessoa;
import br.com.aplicacao2.entity.PessoaEntity;
import br.com.aplicacao2.repository.GeradorDeCadastroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeradorDeCadastro {

    @Autowired
    private GeradorDeCadastroRepository repository;

    public void save(Pessoa bodyFila) {
        repository.save(PessoaEntity
                .builder()
                        .idade(bodyFila.getIdade())
                        .nome(bodyFila.getNome())
                        .endereco(bodyFila.getEndereco())
                .build()
        );
    }
}
