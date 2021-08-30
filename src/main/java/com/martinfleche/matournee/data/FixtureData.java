package com.martinfleche.matournee.data;

import com.martinfleche.matournee.bean.Contact;
import com.martinfleche.matournee.dao.ContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FixtureData {
    @Autowired
    ContactDAO contactDAO;


    @EventListener
    public void appReady(ApplicationReadyEvent event){
        Contact contact1 = contactDAO.save(new Contact("Robert Michel"));
    }

}
