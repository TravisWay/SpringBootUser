package com.travis.spring.database.databaseDemo.jdbc;

import com.travis.spring.database.databaseDemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.List;

@Repository
public class PersonDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            return person;
        }
    }

    public List<Person> findAll(){
        return jdbcTemplate.query("Select * from Person",
                new PersonRowMapper());
    }

    public Person findbyId(int id){
        return jdbcTemplate.queryForObject("Select * From Person Where id=?",
                new Object[]{id}, new PersonRowMapper());
    }

    public int deletebyId(int id){
        return jdbcTemplate.update("Delete From Person Where id=?",
                new Object[]{id});
    }

    public int insertPerson(Person person){
        return jdbcTemplate.update("INSERT INTO Person(id,name,location,birth_date) VALUES(?,?,?,?)",
                new Object[]{person.getId(),person.getName(),
                        person.getLocation()});
    }
    public int updatePerson(Person person){
        return jdbcTemplate.update("update Person set name = ?, location = ?," +
                        "birth_date = ? where id = ?",
                new Object[]{person.getName(),person.getLocation(),
                        person.getId()});
    }


}
