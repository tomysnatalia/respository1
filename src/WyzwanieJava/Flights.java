import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        database.checkIfFlightExists("Berlin","Tokyo");
        database.getFlightsFromCity("Paris");
        database.getFlightsToCity("Warsaw");
        ArrayList<String> cities = database.getCities();
        System.out.println(cities);
        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest flight" + cheapestFlight.getDetails());


    }
}

class Flight {
    String departure;
    String arrival;
    int price;

    public Flight (String departure, String arrival, int price){
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getDetails(){
        return "Flight from " + this.departure + " to " + this.arrival + " costs " + this.price;

    }
}


class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
        flights.add(new Flight("Berlin", "Tokyo", 1800));
        flights.add(new Flight("Paris", "Berlin", 79));
        flights.add(new Flight("Warsaw", "Paris", 120));
        flights.add(new Flight("Madrid", "Berlin", 200));
        flights.add(new Flight("Berlin", "Warsaw", 77));
        flights.add(new Flight("Paris", "Madrid", 180));
        flights.add(new Flight("Porto", "Warsaw", 412));
        flights.add(new Flight("Madrid", "Porto", 102));
        flights.add(new Flight("Warsaw", "Madrid", 380));
    }

    public void checkIfFlightExists (String start, String end) {
        boolean notExists = true;
        for (Flight flight : this.flights) {
            if (start.equals(flight.departure) && end.equals(flight.arrival)) {
                System.out.println("Flight exists!");
                notExists = false;
                return;
            }
        }
        System.out.println("Flight with given params not exist");
    }

    public void getFlightsFromCity (String city) {
        boolean isNotFound = true;
        for (Flight flight : this.flights) {
            if (city.equals(flight.departure)){
                System.out.println(flight.getDetails());
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println("Flight not found");
        }
    }
    public void getFlightsToCity (String city) {
        boolean isNotFound = true;
        for  (Flight flight : this.flights) {
            if (city.equals(flight.arrival)) {
                System.out.println(flight.getDetails());
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println("Flight not found");
        }
    }

    public void displayFlights (ArrayList<Flight>results) {
        if (results.isEmpty()) {
            System.out.println("Flight not found");
        }
        for (int i=0; i<results.size(); i++) {
            Flight flight = results.get(i);
            System.out.println(flight.getDetails());
        }
    }

    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (Flight flight : this.flights) {
            if (!cities.contains(flight.departure)) {
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

    public Flight getCheapestFlight() {
        Flight cheapestFlight = null;
        for (Flight flight : this.flights){
            if (cheapestFlight == null || flight.price < cheapestFlight.price) {
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }



}
