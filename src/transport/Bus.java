package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String color,
               int productionYear, String productionCountry,
               int maxSpeed, String fuel, double fuelPercentAge) {
        super(brand, model, color, productionYear,
                productionCountry, maxSpeed, fuel, fuelPercentAge);
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправлен топливом " + getFuel());
        setFuelPercentAge(100);
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }
}
