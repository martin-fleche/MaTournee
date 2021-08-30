package com.martinfleche.matournee.service;

import com.martinfleche.matournee.bean.Contact;
import com.martinfleche.matournee.dao.ContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactDAO contactDAO;

    @Override
    public Contact createOrUpdate(Contact contact) {
        return contactDAO.save(contact);
    }

    @Override
    public void delete(int id) {
        contactDAO.deleteById(id);
    }

    @Override
    public Optional<Contact> findById(int id) {
        return contactDAO.findById(id);
    }

    @Override
    public List<Contact> findAll() {
        return (List<Contact>) contactDAO.findAll();
    }
}
