package com.cdc;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cdc.sbeans.WishMessageGenerator;

@SpringBootApplication
public class Proj01DependencyInjectionApplication {
	
	@Bean(name="ldt")
	public LocalDateTime createLdt() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Proj01DependencyInjectionApplication.class, args);
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		String wishes=generator.wishMessage("pavan");
		System.out.println(wishes);
		String season=generator.findSeason();
		System.out.println(season);
	}

}
