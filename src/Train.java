public class Train extends Transport {

    private int costTrip;
    private String travelTime;
    private String departureStations;
    private String terminalStation;
    private int numberWagons;

    public Train(String marka, String model, int yearOfProduction, String countryOfProduction, String colour,
                 int maxSpeed, int costTrip, String travelTime, String departureStations, String terminalStation, int numberWagons) {
        super(marka, model, yearOfProduction, countryOfProduction, colour, maxSpeed);
        if (costTrip <= 0) {
            this.costTrip = 15;
        } else {
            this.costTrip = costTrip;
        }
        if (travelTime != null && !travelTime.isEmpty() && !travelTime.isBlank()) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = "Информация не указана";
        }
        if (departureStations != null && !departureStations.isEmpty() && !departureStations.isBlank()) {
            this.departureStations = departureStations;
        } else {
            this.departureStations = "Информация не указана";
        }
        if (terminalStation != null && !terminalStation.isEmpty() && !terminalStation.isBlank()) {
            this.terminalStation = terminalStation;
        } else {
            this.terminalStation = "Информация не указана";
        }
        if (numberWagons <= 0) {
            this.numberWagons = 15;
        } else {
            this.numberWagons = numberWagons;
        }
    }

    public int getCostTrip() {
        return costTrip;
    }

    public void setCostTrip(int costTrip) {
        if (costTrip <= 0) {
            this.costTrip = 15;
        } else {
            this.costTrip = costTrip;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime != null && !travelTime.isEmpty() && !travelTime.isBlank()) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = "Информация не указана";
        }
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public void setDepartureStations(String departureStations) {
        if (departureStations != null && !departureStations.isEmpty() && !departureStations.isBlank()) {
            this.departureStations = departureStations;
        } else {
            this.departureStations = "Информация не указана";
        }
    }

    public String getTerminalStation() {
        return terminalStation;
    }

    public void setTerminalStation(String terminalStation) {
        if (terminalStation != null && !terminalStation.isEmpty() && !terminalStation.isBlank()) {
            this.terminalStation = terminalStation;
        } else {
            this.terminalStation = "Информация не указана";
        }
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons <= 0) {
            this.numberWagons = 15;
        } else {
            this.numberWagons = numberWagons;
        }
    }
}
