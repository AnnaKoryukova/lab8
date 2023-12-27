package koryukova.lab8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("koryukova.lab8.entity")
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

}
