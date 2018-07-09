package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/createTable", method = RequestMethod.GET)
    public void createTable() {
        try {
            jdbcTemplate.execute("create table customers(\n" +
                    "id Serial,\n" +
                    "name varchar(255),\n" +
                    "age varchar(255) ) ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @RequestMapping(value = "/putData", method = RequestMethod.GET)
    public void PutData() {
        try {
            jdbcTemplate.execute("insert into      customers (id, name, age) values (1,  'Test', '30')");
        } catch (Exception e) {

        }
    }


}
