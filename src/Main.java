public class Main {
    public static void main(String[] args)
    {
        Transport lada = new Transport ("Лада", "Ларгус", 2020, "Россия", "зеленый", 160);
        Transport kia = new Transport("Киа", "Рио", 2020, "Южная Корея", null, 195);

    printInfoTransport(lada);
    printInfoTransport(kia);
    }

    private static void printInfoTransport(Transport transport) {
        System.out.println("Марка - " + transport.getMarka() +
                ". Модель - " + transport.getModel() +
                ". Год выпуска - " + transport.getYearOfProduction() +
                ". Страна производства - " + transport.getCountryOfProduction() +
                ". Цвет - " + transport.getColour() +
                ". Максимальная скорость - " + transport.getMaxSpeed() + " км./ч.");
    }
    }