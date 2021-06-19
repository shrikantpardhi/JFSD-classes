package net.guides.springboot.todomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class })
@ComponentScan ({"net.guides.springboot.todomanagement"})
@EnableMongoRepositories ("net.guides.springboot.todomanagement.repository") 
public class TodoManagementSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagementSpringBootApplication.class, args);
	}

}
