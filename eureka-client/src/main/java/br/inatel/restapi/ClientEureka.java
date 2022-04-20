package br.inatel.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ClientEureka {


	public static void main(String[] args) {
		SpringApplication.run(ClientEureka.class, args);
	}

}