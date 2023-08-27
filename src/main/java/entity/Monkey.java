package entity;

public class Monkey extends AbstractAnimal {
    @Override
    void voice() {
        super.voice();
        System.out.println("Я обезьяна уа-аа-аа-а");
    }

    @Override
    void jump() {
        System.out.println("Я обезьяна прыгаю с лианы на лиану");
    }
}
