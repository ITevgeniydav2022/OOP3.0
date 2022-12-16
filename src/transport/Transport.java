package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private int maxSpeed;
    private String fuel;
    private double fuelPercentAge;

    public Transport(String brand,
                     String model,
                     String color,
                     int productionYear,
                     String productionCountry,
                     int maxSpeed, String fuel, double fuelPercentAge) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.fuel = fuel;
        this.fuelPercentAge = fuelPercentAge;
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "чёрный";
        }
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelPercentAge() {
        return fuelPercentAge;
    }

    public void setFuelPercentAge(double fuelPercentAge) {
        this.fuelPercentAge = fuelPercentAge;
    }

    public abstract void refill();

    @Override
    public String toString() {
        return brand  +
                ", Модель: " + model  +
                ", Цвет: " + color  +
                ", Год выпуска: " + productionYear +
                ", Страна производства: " + productionCountry  +
                ", Скорость передвижения: " + maxSpeed + " км/ч. " +
                ", Топливо: " + fuel +
                ", Количество топлива в процентах: " + fuelPercentAge + ". ";
    }
}
