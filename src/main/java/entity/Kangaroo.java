package entity;

public class Kangaroo extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я кенгуру и я рычу");
    }

    @Override
    void jump() {
        System.out.println("Я кенгуру и я не только прыгаю но и дерусь");
    }
}
