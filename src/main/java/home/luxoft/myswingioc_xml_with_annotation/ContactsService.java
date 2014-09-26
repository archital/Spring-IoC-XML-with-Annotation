

package home.luxoft.myswingioc_xml_with_annotation;

import java.util.List;


public interface ContactsService {
    
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
