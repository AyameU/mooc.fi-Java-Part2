import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    Map<String, Person> contactBook;

    public ContactBook() {
        contactBook = new HashMap<String, Person>();
    }

    public void addPerson(Person person) {
        contactBook.put(person.getName(), person);
    }
}
