import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        if(owners.containsValue(null)) {
            return false;
        }
        if(owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if(owners.containsValue(null)) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if(!owners.containsKey(plate)) {
            return false;
        }
        else if(owners.containsValue(null)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        ArrayList<RegistrationPlate> allCodes = new ArrayList<RegistrationPlate>(owners.keySet());

        for(RegistrationPlate plate : allCodes) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> allOwners = new ArrayList<String>(owners.values());
        ArrayList<String> allOwnersNoDuplicates = new ArrayList<String>();

        for(String owner : allOwners) {
            if(!allOwnersNoDuplicates.contains(owner)) {
                allOwnersNoDuplicates.add(owner);
                System.out.println(owner);
            }
        }
    }
}
