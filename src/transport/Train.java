package transport;

public class Train extends Transport {

    private int cost;
    private int time;
    private String departureStation;
    private String terminalStation;
    private int amountWagons;


    public Train(String brand, String model, String color, int productionYear,
                 String productionCountry, int maxSpeed, String fuel, double fuelPercentAge,
                 int cost, int time, String departureStation,
                 String terminalStation, int amountWagons) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuel, fuelPercentAge);
        this.cost = cost;
        this.time = time;
        this.departureStation = departureStation;
        this.terminalStation = terminalStation;
        this.amountWagons = amountWagons;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getTerminalStation() {
        return terminalStation;
    }

    public void setTerminalStation(String terminalStation) {
        this.terminalStation = terminalStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправлен топливом " + getFuel());
        setFuelPercentAge(100);
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString() +
                "Стоимость поездки: " + cost + " руб." +
                ", Время в пути: " + time + " часа" +
                ", Станция отправления " + departureStation + '\'' +
                ", Конечная станция " + terminalStation + '\'' +
                ", в поезде " + amountWagons +
                " вагонов.";
    }

}
