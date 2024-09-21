package com.example.ProjConfig_serverInfnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProjConfigServerInfnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjConfigServerInfnetApplication.class, args);
	}

}
