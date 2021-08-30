package com.martinfleche.matournee.dao;

import com.martinfleche.matournee.bean.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactDAO extends CrudRepository<Contact, Integer> {

}
