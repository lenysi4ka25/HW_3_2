public class Main {
    public static void main(String[] args) {
        Transport lada = new Transport("Лада", "Гранта", 2015, "Россия", "бежевый", 150);
        Transport kia = new Transport("Дэу", "Нексия", 2022, "Узбекистан", "черный", 180);
        Train lastochka = new Train("Ласточка", "В-901", 2001, "Россия", "красный", 301,
                3500, "07:34", "Белорусский вокзал", "Минск-Пассажирский", 0);
        Train leningradec = new Train( "Ленинградец", "D-125", 2019, "Россия", "зеленый", 270,
                1700, "12:06", "Ленинградский вокзал", null, 19);
        Bus maz = new Bus(25, "4 часа", 7);

        printInfoTransport(lada);
        printInfoTransport(kia);
        printInfoTrain(lastochka);
        printInfoTrain(leningradec);
        printInfoBus(maz);
    }

    public static void printInfoTransport(Transport transport) {
        System.out.println("Марка - " + transport.getMarka() +
                ". Модель - " + transport.getModel() +
                ". Год выпуска - " + transport.getYearOfProduction() +
                ". Страна производства - " + transport.getCountryOfProduction() +
                ". Цвет - " + transport.getColour() +
                ". Максимальная скорость - " + transport.getMaxSpeed() + " км./ч.");
    }

    public static void printInfoTrain(Train train) {
        System.out.println("Поезд - " + train.getMarka() +
                 ". Модель поезда - " + train.getModel() +
                 ". Год выпуска - " + train.getYearOfProduction() +
                 ". Страна производства - " + train.getCountryOfProduction() +
                 ". Цвет - " + train.getColour() +
                 ". Максимальная скорость - " + train.getMaxSpeed() + " км./ч" +
                 ". Стоимость билета - " + train.getCostTrip() + " руб " +
                 ". Время отправления - " + train.getTravelTime() +
                 ". Станция отправления - " + train.getDepartureStations() +
                 ". Станция назначения - " + train.getTerminalStation() +
                 ". Количество вагонов в составе - " + train.getNumberWagons() + ".");

    }

    public static void printInfoBus(Bus bus) {
        System.out.println("Количество мест - " + bus.getNumberSeats() +
                ". Время в пути - " + bus.getArrivalTime() + " часов" +
                ". Количество остановок в пути - " + bus.getNumberOfStops() + ".");
    }
}
