package com.usa;

import com.usa.controller.Controller;
import com.usa.modelo.ProductoRepository;
import com.usa.vista.Interfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;


@SpringBootApplication
@ComponentScan("com.usa.modelo")
@EnableJdbcRepositories("com.usa.modelo")

public class Reto6Application {

    @Autowired
    ProductoRepository repositorio;
    
	public static void main(String[] args) {
		
                SpringApplicationBuilder builder = new SpringApplicationBuilder(Reto6Application.class);
                builder.headless(false);
                ConfigurableApplicationContext context = builder.run(args);
                
	}
        @Bean
        ApplicationRunner applicationRunner(){
            return (args) -> {
                Interfaz interfaz = new Interfaz();
                Controller controlador = new Controller(repositorio, interfaz);
            };
        }

}
