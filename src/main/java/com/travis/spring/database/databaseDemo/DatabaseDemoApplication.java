package com.travis.spring.database.databaseDemo;

import com.travis.spring.database.databaseDemo.entity.Person;
import com.travis.spring.database.databaseDemo.jdbc.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	PersonDAO personDAO;

	private Logger logger = LoggerFactory.getLogger(DatabaseDemoApplication.class);

//	public static void main(String[] args) {
//		SpringApplication.run(DatabaseDemoApplication.class, args);
//	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All user -> {}",personDAO.findAll());
//		logger.info("User id 10001 -> {}", personDAO.findbyId(10001));
//		logger.info("Deleting 10002 -> No of rows deleted -> {}", personDAO.deletebyId(10002));
//		logger.info("Insert 10004 -> {}", personDAO.insertPerson(new Person(10004,
//                "Tz", "Swissland", new Date())));
//        logger.info("Update 10003 -> {}", personDAO.updatePerson(new Person(10003,
//                "Tz1", "1Swissland1", new Date())));
//        logger.info("All user -> {}",personDAO.findAll());


	}
}
