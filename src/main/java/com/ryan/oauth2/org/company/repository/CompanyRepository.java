package com.ryan.oauth2.org.company.repository;

import com.ryan.oauth2.org.company.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findOneByName(String name);
}
