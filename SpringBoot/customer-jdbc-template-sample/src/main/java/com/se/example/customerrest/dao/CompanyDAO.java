package com.se.example.customerrest.dao;
import com.se.example.customerrest.entities.Company;

import java.util.List;


public interface CompanyDAO {

    public void saveOrUpdate(Company company);

    public void delete(String companyId);

    public Company get(String companyId);

    public List<Company> list();
}