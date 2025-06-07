package InheritPolyEncapAbs;

public class Elephant extends Animal {
    public Elephant(String name, int age, String enclosure){
        super(name, age, enclosure);
    }

    @Override
    public void eat(){
        System.out.println("🐘 " + getName() + " eats 10kg of leaves.");
        setHunger(0);
    }

    @Override
    public void sleep(){
        System.out.println("🐘 " + getName() + " sleeps under the shade of trees");
    }

    @Override
    public void makeSound(){
        System.out.println("🐘 " + getName() + " trumpets");
    }
}
