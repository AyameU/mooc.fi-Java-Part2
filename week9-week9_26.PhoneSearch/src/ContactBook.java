import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    ArrayList<HashMap> contactBook = new ArrayList<HashMap>();
    HashMap<String, Person> contact;

    public ContactBook() {
        this.contact = new HashMap<String, Person>();
    }

    public void addPerson(Person person) {
        this.contact.put(person.getName(), person);
        contactBook.add(this.contact);
    }

    // public String searchByPhoneNumber(Person person) {}
}
