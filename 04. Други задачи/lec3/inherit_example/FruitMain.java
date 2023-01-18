package lectures.lec3.inherit_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FruitMain {
    public static void main(String[] args) {
        // create object form classes Apple and Berry
        Apple apple1 = new Apple(Taste.SWEET, true, false, 4);
        Berry berry1 = new Berry(Taste.SOUR, true, true, "wild berry");
        Berry berry2 = new Berry(Taste.SOUR, true, false, "strawberry");

        // calls common methods form class Fruit
        System.out.println("Is eatable: ");
        System.out.println(apple1.isEatable()); // true
        System.out.println(berry1.isEatable()); // false
        System.out.println(berry2.isEatable()); // true
        System.out.println();

        // calls specific methods form classes Apple and Berry
        System.out.println("apple1.getAgeOfTree -> " + apple1.getAgeOfTree());
        System.out.println("berry2.getTypeOfBerry -> " + berry2.getTypeOfBerry());
        // System.out.println(apple1.getTypeOfBerry()); or System.out.println(berry2.getAgeOfTree()); will throw exception
        System.out.println();

        // both appleFruit and berryFruit are object of type Fruit but created with child constructors
        Fruit appleFruit = new Apple(Taste.SOUR, false, false, 6);
        Fruit berryFruit = new Berry(Taste.SWEET, true, false, "strawberry");
        ArrayList<Fruit> arrayOfFruits = new ArrayList<>(); // like list in python
        arrayOfFruits.add(appleFruit);
        arrayOfFruits.add(berryFruit);
        System.out.println();
        for (Fruit fruit : arrayOfFruits){
            System.out.println(fruit); // implement toSting() but
            // if fruit is instance of Apple calls Apple.toString()
            // else if is instance of Berry calls Berry.toString()
        }
    }
}
