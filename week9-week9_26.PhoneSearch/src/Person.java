import java.util.*;

public class Person {
    private Map<String, List<Set<String>>> contactInfo = new HashMap<String, List<Set<String>>>();
    private List contactInfoList = new ArrayList<Set<String>>();
    private Set<String> phoneNumbers = new HashSet<String>();
    private String name;

    public Person(String name) {
        this.name = name;
        this.contactInfo.put(this.name, contactInfoList);
    }

    public String getName() {
        return this.name;
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public void getPhoneNumber() {
        if(phoneNumbers.isEmpty()) {
            System.out.println("not found");
        }
        else {
            for(String p : phoneNumbers) {
                System.out.println(p);
            }
        }
    }

    public String toString() {
        return this.name;
    }
}
