package animal;

public class Herbivore extends Mammal {

    public Herbivore(String name, int age, String environment,
                     int travelSpeed, String typeFood) {
        super(name, age, environment, travelSpeed, typeFood);
    }

    public void graze() {
        System.out.println("Травоядное пасётся");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное питается " + getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Травоядное передвигается неспеша");
    }

    @Override
    public void walk() {
        System.out.println("Травоядное гуляет на лугу");
    }
}
