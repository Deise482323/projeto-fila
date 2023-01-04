package br.com.cadastro.service;

import br.com.cadastro.amqp.PublisherCadastro;
import br.com.cadastro.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicarEmFilaSalvar {

    @Autowired
    private PublisherCadastro publisherCadastro;

    public void execute(Pessoa pessoa) {
        publisherCadastro.send(pessoa);

    }
}
