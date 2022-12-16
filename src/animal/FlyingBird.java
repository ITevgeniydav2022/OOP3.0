package animal;

public class FlyingBird extends Bird{

    public FlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица питается что попадется.");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит ночью и днем.");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица передвигается " + getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотится в воздухе или земле.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
