package com.travis.spring.database.databaseDemo;

import com.travis.spring.database.databaseDemo.entity.Person;
import com.travis.spring.database.databaseDemo.jpa.PersonJPARepo;
import com.travis.spring.database.databaseDemo.springdata.PersonSpringDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

        @Autowired
        PersonSpringDataRepo personSpringDataRepo;

        @RequestMapping("/findAll")
        //public List<Person> findAll(@RequestParam(value="name", defaultValue="World") String name) {
        public List<Person> findAll() {
            return personSpringDataRepo.findAll();
        }


        @RequestMapping("/add")
        //public List<Person> findAll(@RequestParam(value="name", defaultValue="World") String name) {
        public String add(@RequestParam(value="name") String name,
                          @RequestParam(value="location", defaultValue="Seattle") String location) {
                try {
                        return personSpringDataRepo.save(new Person(name, location)).toString();
                }catch(Exception e){
                        return "User with Name \"" + name + "\" already exists";
                }
        }
        @RequestMapping("/delete")
        public boolean delete(@RequestParam(value="id") int id) {
                try {
                        personSpringDataRepo.deleteById(id);
                        if (!findById(id).isPresent()) {
                                return false;
                        }
                        return true;
                }catch(Exception e){
                        return false;
                }
        }

        @RequestMapping("/findById")
        public Optional<Person> findById(@RequestParam(value="id") int id) {
                return personSpringDataRepo.findById(id);

        }
}
