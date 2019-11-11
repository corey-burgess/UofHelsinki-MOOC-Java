import java.util.HashMap;
import java.util.ArrayList;

public class AirportPanel {

    private HashMap<String,Integer> planes;
    private ArrayList<String> flights;

    public AirportPanel(){
        this.planes = new HashMap<String,Integer>();
        this.flights = new ArrayList<String>();
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
    }

    public void printAirportMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    public void addPlane(String id, int capacity){

        this.planes.put(id,capacity);
    }

    public String getCapacity(String plane) {
        return "(" + this.planes.get(plane) + " ppl)";
    }

    public void addFlight(String plane, String dep, String des){
        String trip = "(" + dep + "-" + des + ")";
        String flight = plane + " " + getCapacity(plane) + " " + trip;
        this.flights.add(flight);
    }

    public ArrayList<String> getFlightList() {
        return this.flights;
    }

    public HashMap<String,Integer> getPlaneList() {
        return this.planes;
    }
}
