package com.dev.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqDevApplication implements CommandLineRunner{
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqDevApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		SimpleMessage simpleMessage = new SimpleMessage();
		simpleMessage.setName("simpleMessage");
		simpleMessage.setMessage("hello from simple messsage..");
		rabbitTemplate.convertAndSend("Test_Exchange", "testRoutingKey", simpleMessage);
		
	}

}
