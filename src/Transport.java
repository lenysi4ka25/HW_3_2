public abstract class Transport {

    public String marka;
    protected String model;
    protected int yearOfProduction;
    protected  String countryOfProduction;
    protected String colour;
    protected int maxSpeed;

    public Transport() {
       // public Transport(marka, model, yearOfProduction, countryOfProduction, colour, maxSpeed) {
        /*this.marka = marka;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.countryOfProduction = countryOfProduction;
        this.colour = colour;
        this.maxSpeed = maxSpeed;*/

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
    //}


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
        if (maxSpeed <= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 200;
        }
    }
    public abstract void refill();
}