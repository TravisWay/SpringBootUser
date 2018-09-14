package com.travis.spring.database.databaseDemo.springdata;

import com.travis.spring.database.databaseDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepo extends JpaRepository<Person, Integer> {



}
