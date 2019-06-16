package org.apache.servicecomb.samples.springmvchello.provider.springmvcprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;

@SpringBootApplication
@EnableServiceComb
public class SpringmvcproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcproviderApplication.class, args);
	}
}
