package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JavaSpringcloudconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringcloudconfigServerApplication.class, args);
	}
}
