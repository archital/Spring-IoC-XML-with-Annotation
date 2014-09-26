/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.luxoft.myswingioc_xml_with_annotation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class ContactsServiceImplement implements ContactsService{
    
    @Autowired
    private ContactsDao contactsDao;
    @Value("${maxsize}")
    private int conlistprop;
    boolean maxsizeContact;


    public int getConlistprop() {
        return conlistprop;
    } 
    public void setContactsDao(ContactsDao contactsDao) {
        this.contactsDao = contactsDao;
    }
  
    public void setConlistprop(int conlistprop) {
        this.conlistprop = conlistprop;
    }
    
    public void addContact(Contact contact) {
       contactsDao.addContact(contact);
    }

    public void deleteContact(Contact contact) {
        contactsDao.deleteContact(contact);
    }

    public List<Contact> getAllContacts() {
        return contactsDao.getAllContacts();
    }

    public void clearAll() {
       contactsDao.clearAll();
    }
    
       public boolean checkMaxSize(int conlistprop, List contactlist){
    if(contactsDao.getAllContacts().size()<conlistprop) {
        maxsizeContact = true;
        return maxsizeContact;
        }else { maxsizeContact=false;
    return maxsizeContact;
    }
    
}
}
