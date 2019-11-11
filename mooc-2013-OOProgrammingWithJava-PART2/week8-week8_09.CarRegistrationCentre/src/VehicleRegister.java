import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate plate) {
        if (get(plate) == null) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        String compared = "";
        for (RegistrationPlate plate : owners.keySet()) {
            if (!owners.get(plate).equals(compared)){
                System.out.println(owners.get(plate));
                compared = owners.get(plate);
            }
        }
    }
}
