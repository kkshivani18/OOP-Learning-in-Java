package InheritPolyEncapAbs;

// Assignment Title: AI-Controlled Smart Zoo
//Imagine you're building software for a futuristic Smart Zoo, where each animal enclosure is managed by AI.
// Each animal can perform actions (eat, sleep, roam), but different species behave differently.
// Zookeepers interact with a dashboard that controls animal behaviors.

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper();

        Animal lion1 = new Lion("Sher Khan", 12, "Enclosure 019");
        Animal elephant1 = new Elephant("Jumbo", 10, "Enclosure 045");
        Animal parrot1 = new Parrot("Imli", 2, " Enclosure 005");

        List<Animal> zooAnimal = new ArrayList<>();
        zooAnimal.add(lion1);
        zooAnimal.add(elephant1);
        zooAnimal.add(parrot1);

        for(Animal animal : zooAnimal){
            System.out.println("Routine for: " + animal.getName());
            animal.performDailyRoutine();
            keeper.checkAnimalStatus(animal);
            System.out.println("-------------------------------------");
        }

        keeper.feedAnimal(lion1);
        keeper.changeMood(parrot1, "Zesty");
        keeper.healAnimal(elephant1);
        System.out.println("After zookeeper intervention: ");

        for(Animal animal: zooAnimal){
            keeper.checkAnimalStatus(animal);
        }
    }
}
