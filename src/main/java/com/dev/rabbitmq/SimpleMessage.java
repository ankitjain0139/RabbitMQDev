package com.dev.rabbitmq;

import java.io.Serializable;

import lombok.Data;

@Data
public class SimpleMessage implements Serializable{
	
	private String name;
	private String message;
	
	public SimpleMessage() {
		super();
	}
	
}
