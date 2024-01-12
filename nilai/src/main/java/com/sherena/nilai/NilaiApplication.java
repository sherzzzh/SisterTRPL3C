package com.sherena.nilai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NilaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NilaiApplication.class, args);
	}
        
        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate(); //mendaftarkan fungsi ke framework
        }

}
