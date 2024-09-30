package br.com.vpelizzarisilva.meme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Vinícius Pelizzari
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "br.com.cfarias.meme.repository")
public class MemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemeApplication.class, args);
	}

}
