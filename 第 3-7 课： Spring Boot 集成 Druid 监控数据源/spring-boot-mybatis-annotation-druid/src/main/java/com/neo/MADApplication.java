package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neo.mapper")
public class MADApplication {

	public static void main(String[] args) {
		SpringApplication.run(MADApplication.class, args);
	}
}
