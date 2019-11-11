public class FlightService {

    public FlightService() {
        System.out.println("Flight service");
        System.out.println("------------\n");
    }

    public void printFlightMenu() {
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }

    public void printFlights(AirportPanel panel){
        for (String flight : panel.getFlightList()){
            System.out.println(flight);
        }
    }

    public void printPlanes(AirportPanel panel) {
        for (String key : panel.getPlaneList().keySet()) {
            System.out.println(key + " " + panel.getCapacity(key));
        }
    }

}
