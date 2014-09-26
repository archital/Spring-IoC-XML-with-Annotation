

package home.luxoft.myswingioc_xml_with_annotation;

import java.util.List;

public class Contact {

 private  int number;
 private   String name;

    public Contact(int number, String name) {
        this.number = number;
        this.name = name;
        
    }

    @Override
    public String toString() {
        return "Contact{" + "number=" + number + ", name=" + name + '}';
    }
    
}
