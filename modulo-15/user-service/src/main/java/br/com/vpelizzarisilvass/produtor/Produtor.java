package br.com.vpelizzarisilvass.produtor;

import br.com.user_service.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinícius Pelizzari
 */

@RestController
@RequestMapping("/mensagens")
public class Produtor {
    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void enviandoMensagem(@RequestBody String mensagem) {
        System.out.println("Enviando mensagem" + mensagem);

        serviceRabbitMQ.enviaMensagem(mensagem);
    }
}
