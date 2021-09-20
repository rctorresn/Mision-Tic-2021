package com.usa;

import com.usa.controlador.ControladorProducto;
import com.usa.modelo.RepositorioProducto;
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

public class InventarioApp {

	@Autowired
        RepositorioProducto repositorio;
    
	public static void main(String[] args) {
		
                SpringApplicationBuilder builder = new SpringApplicationBuilder(InventarioApp.class);
                builder.headless(false);
                ConfigurableApplicationContext context = builder.run(args);
                
	}
        @Bean
        ApplicationRunner applicationRunner(){
            return (args) -> {
                Interfaz interfaz = new Interfaz();
                ControladorProducto controlador = new ControladorProducto(repositorio, interfaz);
            };
        }

}
