package InheritPolyEncapAbs;

public class Parrot extends Animal {
    public Parrot (String name, int age, String enclosure){
        super(name, age, enclosure);
    }

    @Override
    public void eat(){
        System.out.println("🦜 " + getName() + " eats seeds, nuts and some insects.");
        setHunger(0);
    }

    @Override
    public void sleep(){
        System.out.println("🦜 " + getName() + " sleeps on tree");
    }

    @Override
    public void makeSound(){
        System.out.println("🦜 " + getName() + " squawks");
    }
}
