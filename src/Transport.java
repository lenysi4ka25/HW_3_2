public class Transport {

    private String marka;
    private String model;
    private final int yearOfProduction;
    private final String countryOfProduction;
    private String colour;
    private int maxSpeed;

    public Transport(String marka, String model, int yearOfProduction, String countryOfProduction, String colour, int maxSpeed) {
        if (marka != null && !marka.isEmpty() && !marka.isBlank()) {
            this.marka = marka;
        } else {
            this.marka = "Информация не указана";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана";
        }
        this.yearOfProduction = yearOfProduction;
        this.countryOfProduction = countryOfProduction;
        if (colour != null && !colour.isEmpty() && !colour.isBlank()) {
            this.colour = colour;
        } else {
            this.colour = "Информация не указана";
        }
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka != null && !marka.isEmpty() && !marka.isBlank()) {
            this.marka = marka;
        } else {
            this.marka = "Информация не указана";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Информация не указана";
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty() && !colour.isBlank()) {
            this.colour = colour;
        } else {
            this.colour = "Информация не указана";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }
}