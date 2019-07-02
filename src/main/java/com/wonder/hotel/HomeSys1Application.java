package com.wonder.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.wonder.hotel.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HomeSys1Application {

	public static void main(String[] args) {
		SpringApplication.run(HomeSys1Application.class, args);
	}

}
