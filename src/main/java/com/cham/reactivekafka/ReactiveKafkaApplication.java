package com.cham.reactivekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveKafkaApplication {

	//@Autowired
	//private static ReactiveKafkaConsumer reactiveKafkaConsumer;

	public static void main(String[] args) {
		SpringApplication.run(ReactiveKafkaApplication.class, args);
	}

	/*public static void run(java.lang.String... args)  {
		reactiveKafkaConsumer.consumeMessages();
	}*/

}

