package com.travis.spring.database.databaseDemo;

import com.travis.spring.database.databaseDemo.entity.Person;
import com.travis.spring.database.databaseDemo.jdbc.PersonDAO;
import com.travis.spring.database.databaseDemo.jpa.PersonJPARepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoJPAApplication implements CommandLineRunner {

	@Autowired
	PersonJPARepo personJPARepo;

	private Logger logger = LoggerFactory.getLogger(DatabaseDemoJPAApplication.class);

//	//public static void main(String[] args) {
//		SpringApplication.run(DatabaseDemoJPAApplication.class, args);
//	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info(personJPARepo.findById(10001).toString());
//		logger.info("Insert 10004 -> {}", personJPARepo.update(new Person(10004,
//                "Tz", "Swissland", new Date())));
//		logger.info(personJPARepo.findById(10003).toString());
//		logger.info("Update 10003 -> {}", personJPARepo.update(new Person(10003,
//               "Tz1", "1Swissland1", new Date())));
//		logger.info(personJPARepo.findById(10003).toString());
//		personJPARepo.deleteById(10003);
//		logger.info(personJPARepo.findById(10002).toString());
//		logger.info("All users -> {}", personJPARepo.findAll());

	}
}
