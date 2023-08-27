package entity;

import entity.Kangaroo;
import entity.Monkey;
import entity.Squirrel;
import entity.ZooKeeper;

public class Zoo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Kangaroo kangaroo = new Kangaroo();
        Squirrel squirrel = new Squirrel();
        ZooKeeper zooKeeper = new ZooKeeper();

        System.out.println("Смотритель зоопарка идет кормить животных, животные радостно кричат");
        System.out.println("----------------------------");
        zooKeeper.makeVoid(monkey);
        System.out.println("----------------------------");
        zooKeeper.makeVoid(kangaroo);
        System.out.println("----------------------------");
        zooKeeper.makeVoid(squirrel);
        System.out.println("----------------------------");

        System.out.println("Смотритель зоопарка покормил животных и животные прыгают дальше");
        System.out.println("----------------------------");
        zooKeeper.makeJump(monkey);
        System.out.println("----------------------------");
        zooKeeper.makeJump(kangaroo);
        System.out.println("----------------------------");
        zooKeeper.makeJump(squirrel);
        System.out.println("----------------------------");

    }
}
