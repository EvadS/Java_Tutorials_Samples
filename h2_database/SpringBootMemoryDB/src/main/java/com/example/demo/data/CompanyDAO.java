package com.example.demo.data;

import com.example.demo.entities.Company;

import java.util.List;

public interface CompanyDAO {

    public void saveOrUpdate(Company company);

    public void delete(String companyId);

    public Company get(String companyId);

    public List<Company> list();
}
