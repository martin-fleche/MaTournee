package com.martinfleche.matournee.controller;

import com.martinfleche.matournee.bean.Contact;
import com.martinfleche.matournee.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping("")
    public ResponseEntity<List<Contact>> getAllContacts(){
        List<Contact> contacts = contactService.findAll();
        return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
    }
}
