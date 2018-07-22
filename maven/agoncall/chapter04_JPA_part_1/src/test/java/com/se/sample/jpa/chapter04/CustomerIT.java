package com.se.sample.jpa.chapter04;

import com.se.sample.jpa.entities.Book;
import com.se.sample.jpa.entities.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerIT {

    // ======================================
    // =             Attributes             =
    // ======================================

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04TestPU");
    private EntityManager em;
    private EntityTransaction tx;


    @Before
    public void initEntityManager() throws Exception {
        em = emf.createEntityManager();
        tx = em.getTransaction();
    }

    @After
    public void closeEntityManager() throws Exception {
        if (em != null)
            em.close();
    }

    @Test
    public void shouldCreateCustomer() throws Exception {

        String date1 = "01.03.1986";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date birthDate =  format.parse(date1);

        // Creates an instance of book
        Customer customer = new Customer("John", "Deer","+380664778923",
                birthDate, new Date(),"mail@mail.com");

        // Persists the book to the database
        tx.begin();
        em.persist(customer);
        tx.commit();
        assertNotNull("ID should not be null", customer.getId());

        // Retrieves all the books from the database
        List<Customer> customers = em.createNamedQuery("findAllCustomers", Customer.class).getResultList();
        assertEquals(1, customers.size());
        customer = em.createNamedQuery("findCustomerJohn", Customer.class).getSingleResult();

        assertEquals("John", customer.getFirstName());
    }
}
