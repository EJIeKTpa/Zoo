package entity;

public class Squirrel extends AbstractAnimal {

    @Override
    void voice() {
        super.voice();
        System.out.println("Я белка я пищу");
    }

    @Override
    void jump() {
        System.out.println("Я белка Летяга и я умею парить");
    }
}
