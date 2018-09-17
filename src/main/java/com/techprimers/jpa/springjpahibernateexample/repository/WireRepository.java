package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.Impacs;
import com.techprimers.jpa.springjpahibernateexample.model.WireTrans;

public interface WireRepository extends JpaRepository<WireTrans, Integer>{

}
