package com.evad.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="TableName")
public class TestTable {
    @Id
    @GeneratedValue
    private Long id ;

    @NotNull
    private String name;

    ///private List<Subscriber> subscriberList;

    public TestTable() {
    }

    public TestTable(@NotNull String name, List<Subscriber> subscriberList) {
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
