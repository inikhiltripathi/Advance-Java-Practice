package com.nik;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoginRegisterMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterMvcApplication.class, args);
	}

    @Bean(name = "mapper")
    
     public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
