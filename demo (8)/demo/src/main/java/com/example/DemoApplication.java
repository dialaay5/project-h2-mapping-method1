package com.example;
import com.example.model.Book;
import com.example.model.Orders;
import com.example.repository.BookRepository;
import com.example.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Object dataSource = context.getBean("dataSource");

		System.out.println(dataSource);

	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository, OrderRepository repository1) {
		return args -> {
			repository.save(new Book(null, "Spring boot: Up and Running", 841, "Mark Heckler",200));
			System.out.println(repository.count());
			repository1.save(new Orders(null, "book1", "danny", 200, 1, LocalDate.now()));
			System.out.println(repository1.count());
		};
	}
}
