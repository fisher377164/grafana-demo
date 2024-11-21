package com.fisher.game.engine.grafanademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GrafanaDemoApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GrafanaDemoApplication.class, args);
	}

}
