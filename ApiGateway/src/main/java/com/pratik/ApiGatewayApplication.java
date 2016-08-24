package com.pratik;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

	
	Logger log = Logger.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	


	  @Bean
	  public SimpleFilter simpleFilter() {
		  log.info("--simple filter ---");
	    return new SimpleFilter();
	  }
}
