package com.ryan.oauth2.org.company.web;

import com.ryan.oauth2.org.company.model.Company;
import com.ryan.oauth2.org.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/secured/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping
    public List<Company> all() {
        return this.companyService.findAll();
    }

    @GetMapping("/{name}")
    public Company get(@PathVariable String name) {
        return this.companyService.findOneByName(name);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Company company) {
        this.companyService.create(company);
        HttpHeaders headers = new HttpHeaders();
        ControllerLinkBuilder linkBuilder = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(CompanyController.class).get(company.getName()));
        headers.setLocation(linkBuilder.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping
    public  void delete(@PathVariable Long id) {
        this.companyService.delete(id);
    }
}
