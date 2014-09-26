
package home.luxoft.myswingioc_xml_with_annotation;



import java.util.List;


public class ContactsDaoImplement implements ContactsDao{
private List contactlist;



    public ContactsDaoImplement(List contactlist) {
        this.contactlist = contactlist;
    }

    public List getContactlist() {
        return contactlist;
    }
    
    @Override
    public void addContact(Contact contact){
       contactlist.add(contact); 
       }

    @Override
    public void deleteContact(Contact contact) {
       contactlist.remove(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactlist;
    }
    

    @Override
    public void clearAll() {
     contactlist.clear();
    }
    
    
    
 }
