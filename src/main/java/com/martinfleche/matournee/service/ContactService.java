package com.martinfleche.matournee.service;

import com.martinfleche.matournee.bean.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    public Contact createOrUpdate(Contact contact);
    public void delete(int id);
    public Optional<Contact> findById(int id);
    public List<Contact> findAll();
}
