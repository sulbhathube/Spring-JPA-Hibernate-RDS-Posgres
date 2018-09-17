package com.techprimers.jpa.springjpahibernateexample.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Impacs;
import com.techprimers.jpa.springjpahibernateexample.model.UsersContact;
import com.techprimers.jpa.springjpahibernateexample.repository.ImpacsRepository;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersContactRepository;

@RestController
public class ImpactResource {
    private ImpacsRepository impactrepo;

    public ImpactResource(ImpacsRepository impactrepo) {
        this.impactrepo = impactrepo;
    }

    @GetMapping(value = "/all")
    public List<Impacs> getImpacs() {
        return impactrepo.findAll();
    }
}
