package br.com.cadastro.amqp;

import br.com.cadastro.domain.Pessoa;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublisherCadastro {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private ObjectMapper objectMapper;

    @SneakyThrows
    public void send(Pessoa pessoa) {
        rabbitTemplate.convertAndSend(this.queue.getName(), objectMapper.writeValueAsString(pessoa));
    }
}
