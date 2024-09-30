package br.com.vpelizzarisilvass.service;

import br.com.user_service.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vinícius Pelizzari
 */

@Service
public class ServiceRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void enviaMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "ebac.rota.mensagem", mensagem);
    }
}
