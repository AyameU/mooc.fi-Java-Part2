import java.util.*;

public class Person {
    private ArrayList<String> phoneNumbers = new ArrayList<String>();
    private String name;
    private String address;

    public Person(String name) {
        this.name = name;
        this.address = "";
    }

    public String getName() {
        return this.name;
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public ArrayList<String> getPhoneNumber() {
        return this.phoneNumbers;
    }

    public void addAddress(String street, String city) {
        this.address = street + " " + city;
    }

    public void getAddress() {
        // check if addresses exist for contact
        if(this.address.equals(null) || this.address.isEmpty()) {
            System.out.println("address unknown");
        }
        // print address
        else if(!this.address.equals(null) || !this.address.isEmpty()) {
            System.out.println(this.address);
        }
        // check if phone numbers exist for contact
        if(!this.phoneNumbers.isEmpty()) {
            System.out.println("phone numbers: ");
            for(String ph : this.getPhoneNumber()) {
                System.out.println(ph);
            }
        }
        // print phone number(s)
        else if(this.phoneNumbers.isEmpty()) {
            System.out.println("phone number not found");
        }
    }

    public void deleteInformation() {
        this.address = "";
        this.phoneNumbers.clear();
    }

    public String toString() {
        return this.name;
    }
}
