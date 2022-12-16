import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        // Задание 1,2,3,4
        System.out.println("Задание 1,2,3,4");

        Car lada = new Car("Lada", "Granta", "синий",
                2015,"Россия", 220, "бензин", 100);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "черный",
                2020, "Германия", 280, "бензин", 75);
        Car bmw = new Car("BMW", "Z8", "черный",
                2021, "Германия", 280, "бензин", 55);
        Car kia = new Car("KIA", "Sportage", "красный",
                2017, "Южная Корея", 260, "бензин", 80);
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый",
                2016, "Южная Корея", 250, "бензин", 100);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(" ");

        Train lastochka = new Train("Ласточка", "B-901", null, 2011,
                "Россия", 301, "дизель", 55, 3500, 4, "Белорусский вокзал",
                "Минский-Пассажирский", 11);

        Train leningrad = new Train("Ленинград", "D-125", "Зеленый", 2019,
                "Россия", 270, "дизель", 70, 1700, 4, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println(" ");

        Bus liaz = new Bus("ЛиАЗ", "677", "Синий", 1964,
                "Россия", 90, "дизель", 100);
        Bus uaz = new Bus("УАЗ", "452Д", null, 1974,
                "Россия", 80, "дизель", 80);
        Bus laz = new Bus("ЛАЗ", "695М", null, 1960,
                "Россия", 100, "дизель", 100);

        System.out.println(liaz);
        System.out.println(uaz);
        System.out.println(laz);


    }
}