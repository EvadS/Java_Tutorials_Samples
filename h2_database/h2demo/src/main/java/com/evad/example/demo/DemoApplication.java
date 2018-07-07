package com.evad.example.demo;

import com.evad.example.demo.domain.Subscriber;
import com.evad.example.demo.domain.SubscriberRepo;
import com.evad.example.demo.domain.TestTable;
import com.evad.example.demo.domain.TestTableRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(SubscriberRepo repository, TestTableRepo tableRepo) {
        return args -> {
            Subscriber s1 = new Subscriber("Dan", "Vege", "dan.vega@mail.com");
            repository.save(s1);

            Subscriber s2 = new Subscriber("Dan 2", "Vege 2", "dan2.vega@mail.com");
            repository.save(s2);

            repository.save(new Subscriber("Dan 3", "Vege 3", "dan3.vega@mail.com"));


            //not work
           /* TestTable tbl = new TestTable();
            tbl.setName("name ");
            List list = new ArrayList<Subscriber>();

            list.add(s1);
            list.add(s2);
            tableRepo.save(tbl);*/
        };
    }
}
