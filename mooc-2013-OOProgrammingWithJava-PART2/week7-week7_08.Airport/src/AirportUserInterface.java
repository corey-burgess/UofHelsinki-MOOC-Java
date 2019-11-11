import java.util.Scanner;

public class AirportUserInterface {

    private Scanner reader;
    private AirportPanel panel;
    private FlightService service;

    public AirportUserInterface(Scanner reader){
        this.reader = reader;
    }

    public void start(){
        panel = new AirportPanel();
        while(true){
            panel.printAirportMenu();
            String input = reader.nextLine();
            if (input.equals("1")){
                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println("Give plane capacity: ");
                int cap = Integer.parseInt(reader.nextLine());
                panel.addPlane(id,cap);
            }else if(input.equals("2")){
                System.out.println("Give plane ID: ");
                String plane = reader.nextLine();
                System.out.println("Give departure airport code: ");
                String dep = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String des = reader.nextLine();
                panel.addFlight(plane,dep,des);
            }else if (input.equalsIgnoreCase("x")){
                break;
            }
        }
        service = new FlightService();
        while(true) {
            service.printFlightMenu();
            String input = reader.nextLine();
            if (input.equals("1")){
                service.printPlanes(panel);
            }else if (input.equals("2")){
                service.printFlights(panel);
            }else if (input.equals("3")){
                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println(id + " " + panel.getCapacity(id));
            }else if (input.equalsIgnoreCase("x")){
                break;
            }
        }
    }
}
