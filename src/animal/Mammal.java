package animal;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private int travelSpeed;

    private String typeFood;

    public Mammal(String name, int age, String environment, int travelSpeed, String typeFood) {
        super(name, age, environment);
        this.travelSpeed = travelSpeed;
        this.typeFood = typeFood;
    }

    public abstract void walk();


    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (StringUtils.isNullOrEmpty(typeFood)) {
            typeFood = "Всё подряд";
        }
        this.typeFood = typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return travelSpeed == mammal.travelSpeed && Objects.equals(typeFood, mammal.typeFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Скорость передвижения - " + travelSpeed + "км/ч;" +
                " Тип пищи - " + typeFood + " ";
    }
}
