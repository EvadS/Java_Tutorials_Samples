package com.se.sample.jpa.entities;

import com.se.sample.jpa.validation.Email;
import com.se.sample.jpa.validation.MinAge;

import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllCustomers", query = "SELECT b FROM Customer b"),
        @NamedQuery(name = "findCustomerJohn", query = "SELECT b FROM Customer b WHERE b.firstName ='John'")
})
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Email
    private String email;

    @NotNull
    @Size(min = 4, max = 50, message = "Firstname should be between {min} and {max}")
    private String firstName;
    private String lastName;

    private String phoneNumber;

    @MinAge(message = "111111111111111111111111111111111111111111111111111111111111111111111")
    private Date dateOfBirth;
    private Date creationDate;

    public Customer() {
    }

    public Customer(
           String firstName, String lastName, String phoneNumber, Date dateOfBirth, Date creationDate,String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.creationDate = creationDate;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", creationDate=" + creationDate +
                '}';
    }
}
