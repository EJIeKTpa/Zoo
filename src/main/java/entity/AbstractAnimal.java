package entity;

public abstract class AbstractAnimal {
    void voice() {
        System.out.println("Я животное и я кричу");
    }

    abstract void jump();
}
