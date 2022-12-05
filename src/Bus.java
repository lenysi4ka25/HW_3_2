public class Bus extends Transport {

    private final int numberSeats;
    private String arrivalTime;
    private int numberOfStops;

    public Bus(String marka, String model, int yearOfProduction, String countryOfProduction, String colour, int maxSpeed, int numberSeats, String arrivalTime, int numberOfStops) {
        super(marka, model, yearOfProduction, countryOfProduction, colour, maxSpeed);
        this.numberSeats = numberSeats;
        this.arrivalTime = arrivalTime;
        this.numberOfStops = numberOfStops;
    }

    public Bus(int numberSeats, String arrivalTime, int numberOfStops) {
        this.numberSeats = numberSeats;
        this.arrivalTime = arrivalTime;
        this.numberOfStops = numberOfStops;
    }


    public int getNumberSeats() {
        return numberSeats;
    }

       public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }
}