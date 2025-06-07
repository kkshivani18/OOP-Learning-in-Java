package InheritPolyEncapAbs;

// keeps track and takes care of animal
public class ZooKeeper {

    public void feedAnimal(Animal animal){
        System.out.println("Feeding: " + animal.getName());
        animal.setHunger(0);
        animal.setMood("Happy");
    }

    public void healAnimal(Animal animal){
        System.out.println("Healing: " + animal.getName());
        int updateHealth = Math.min(100, animal.getHealth() + 20);
        animal.setHealth(updateHealth);
    }

    public void changeMood(Animal animal, String newMood){
        System.out.println("Changing mood of: " + animal.getName() + " to " + newMood);
        animal.setMood(newMood);
    }

    public void checkAnimalStatus(Animal animal){
        System.out.println("Status of " + animal.getName() + ":");
        System.out.println("Health: " + animal.getHealth());
        System.out.println("Hunger: " + animal.getHunger());
        System.out.println("Mood: " + animal.getMood());
        System.out.println("------------------------------------");
    }
}
