package entity;

public class ZooKeeper {
    void makeVoid(AbstractAnimal abstractAnimal) {
        System.out.println("Я смотритель зоопарка, я очень люблю животных и сейчас животные издадут звук");
        abstractAnimal.voice();
    }
    void makeJump(AbstractAnimal abstractAnimal) {
        System.out.println("Я смотритель зоопарка и сейчас вы увидите как животные прыгают");
        abstractAnimal.jump();
    }
}
