package transport;

public class Car extends Transport {


    public Car(String brand,
               String model,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed, String fuel,
               double fuelPercentAge) {
        super(brand,
                model,
                color,
                productionYear,
                productionCountry,
                maxSpeed,
                fuel,
                fuelPercentAge);
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль заправлен бензином " + getFuel());
        setFuelPercentAge(100);
    }
    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }



}
