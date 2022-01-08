package com.inventory.inventoryws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.inventory")
public class InventorywsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorywsApplication.class, args);
	}

}
