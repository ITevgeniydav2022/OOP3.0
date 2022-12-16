package animal;

public class Predator extends Mammal{

    public Predator(String name, int age, String environment,
                    int travelSpeed, String typeFood) {
        super(name, age, environment, travelSpeed, typeFood);
    }
    public void hunt() {
        System.out.println("Хищник охотится");
    }

    @Override
    public void eat() {
        System.out.println("Хищник питается " + getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Хищник спит днём");
    }

    @Override
    public void go() {
        System.out.println("Хищник передвигается вольяжно");
    }

    @Override
    public void walk() {
        System.out.println("Хищник гуляет в джунглях");
    }
}
