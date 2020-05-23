package com.springboot.rentapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rentapp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
