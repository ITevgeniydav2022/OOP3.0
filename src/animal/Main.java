package animal;

public class Main {

    public static void main(String[] args) {

        Animal gazelle = new Herbivore("Газель", 2, "на земле;",
                80,"растительная пища");
        Animal giraffe = new Herbivore("Жираф", 5, "на земле;",
                40,"листья");
        Animal horse = new Herbivore("Лошадь", 6, "на земле;",
                30,"сено");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.go();
        gazelle.eat();

        System.out.println(" ");

        Animal hyena = new Predator("Гиена", 3, "на земле;",
                30,"мясо");
        Animal tiger = new Predator("Тигр", 8, "на земле;",
                40,"мясо");
        Animal bear = new Predator("Медведь", 10, "на земле;",
                20,"ягоды и мёд");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        hyena.go();
        hyena.eat();

        System.out.println(" ");

        Animal frog = new Amphibian("Лягушка", 1, "В воде");
        Animal snake = new Amphibian("Уж пресноводный", 2, "В воде");

        System.out.println(frog);
        System.out.println(snake);
        frog.go();
        frog.eat();

        System.out.println(" ");

        Animal peacock = new NonFlyingBird("Павлин", 3, "На земле",
                "Передвигаюсь на лапах");
        Animal penguin = new NonFlyingBird("Пингвин", 5, "На льду",
                "Передвигаюсь на лапах");
        Animal dodoBird = new NonFlyingBird("Птица Додо", 4, "На земле",
                "Передвигаюсь на лапах");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        peacock.go();
        peacock.eat();

        System.out.println(" ");

        Animal seagull = new FlyingBird("Чайка", 2, "На воде и суши",
                "при помощи крыльев");
        Animal albotros = new FlyingBird("Альбатрос", 3, "На скалах и воде",
                "при помощи крыльев");
        Animal falcon = new FlyingBird("Сокол", 4, "В степях",
                "при помощи крульев");

        System.out.println(seagull);
        System.out.println(albotros);
        System.out.println(falcon);
        seagull.go();
        seagull.eat();
    }
}
