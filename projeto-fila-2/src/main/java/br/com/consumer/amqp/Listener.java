package br.com.aplicacao2.amqp;

import br.com.aplicacao2.domain.Pessoa;
import br.com.aplicacao2.service.GeradorDeCadastro;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @Autowired
    private GeradorDeCadastro service;

    @Autowired
    private ObjectMapper objectMapper;

    @SneakyThrows
    @RabbitListener(queues = {"cadastro-pessoa"})
    public void receive(@Payload String menssagem) {

        Pessoa bodyFila = objectMapper.readValue(menssagem, Pessoa.class);
        //Chamar o service passando o body
        service.save(bodyFila);
    }
}
