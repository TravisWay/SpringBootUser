package com.travis.spring.database.databaseDemo;

import com.travis.spring.database.databaseDemo.entity.Person;
import com.travis.spring.database.databaseDemo.jpa.PersonJPARepo;
import com.travis.spring.database.databaseDemo.springdata.PersonSpringDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
//public class SpringDataJPAApplication implements CommandLineRunner {
public class SpringDataJPAApplication {

//	@Autowired
//	PersonSpringDataRepo personJPARepo;

	//private Logger logger = LoggerFactory.getLogger(SpringDataJPAApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJPAApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		logger.info(String.valueOf(personJPARepo.findById(10001)));
//		logger.info("Insert 10004 -> {}", personJPARepo.save(new Person(10004,
//                "Tz", "Swissland", new Date())));
//
//		logger.info("Update 10003 -> {}", personJPARepo.save(new Person(10003,
//               "Tz1", "1Swissland1", new Date())));
//
//		//logger.info(String.valueOf(personJPARepo.findById(10003)));
//		//personJPARepo.deleteById(10003);
//		//logger.info(String.valueOf(personJPARepo.findById(10002)));
//		logger.info("All users -> {}", personJPARepo.findAll());

//	}
}
