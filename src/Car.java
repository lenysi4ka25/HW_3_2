public class Car extends Transport {
    public Car(String marka, String model, int yearOfProduction, String countryOfProduction, String colour, int maxSpeed) {
        super();
            }

    @Override
    public void refill() {
        System.out.println("Объекты класса car можно заправлять бензином, дизелем на заправке или" +
                " заряжать на специальных электропарковках, если это электрокар.");
    }
}
