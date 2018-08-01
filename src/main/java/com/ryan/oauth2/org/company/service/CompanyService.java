package com.ryan.oauth2.org.company.service;

import com.ryan.oauth2.org.company.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    Company findOneByName(String name);
    void create(Company company);
    void delete(Long id);
}
