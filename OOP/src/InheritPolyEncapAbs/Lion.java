package InheritPolyEncapAbs;

public class Lion extends Animal {
    public Lion (String name, int age, String enclosure){
        super(name, age, enclosure);
    }

    @Override
    public void eat(){
        System.out.println("🦁 " + getName() + " eats 10kg of meat.");
        setHunger(0);
    }

    @Override
    public void sleep(){
        System.out.println("🦁 " + getName() + " sleeps in a den");
    }

    @Override
    public void makeSound(){
        System.out.println("🦁 " + getName() + " roars loudly");
    }
}
