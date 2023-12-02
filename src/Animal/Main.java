package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", "dark");
        Animal duck = new Duck("Krykva", "grey");
        Animal dog = new Dog("Kubik", "white");
        Shark shark = new Shark();
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(cat);
//        animalList.add(duck);
//        animalList.add(dog);
//        for (Animal animal:animalList){
//            System.out.println(animal);
//       }
        cat.getGo();
        dog.getGo();
        duck.getGo();
        shark.getGo();
        System.out.println();
        cat.getFly();
        dog.getFly();
        duck.getFly();
        shark.getFly();
        System.out.println();
        cat.getSwim();
        dog.getSwim();
        duck.getSwim();
        shark.getSwim();
        System.out.println();
        cat.getVoice();
        dog.getVoice();
        duck.getVoice();
        shark.getVoice();
    }

}