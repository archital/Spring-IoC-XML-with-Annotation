
package home.luxoft.myswingioc_xml_with_annotation;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {
    

    public static void main(String[] args) throws SQLException {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ContactsService cts = context.getBean(ContactsService.class);
        ContactsServiceImplement contactsServiceImplement = (ContactsServiceImplement) context.getBean(ContactsServiceImplement.class);
        Contact contact = (Contact) context.getBean("contact3");
        
      int gettercontactlistprop = contactsServiceImplement.getConlistprop();
      List gettercontactlist = contactsServiceImplement.getAllContacts();
        System.out.println(contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)); //true - если не полная записная книга
        if (contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)==true){
      contactsServiceImplement.addContact(contact);   // попытка добавить еще обьектов класса контакт в List<Contact>
        } else {System.out.println("Contact book is full!");}
        List li = contactsServiceImplement.getAllContacts();
        for (Iterator it = li.iterator(); it.hasNext();) {
            Object object = it.next();
            System.out.println(object.toString());
        }
        
          
            
    }  
}
