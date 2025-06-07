package InheritPolyEncapAbs;

public abstract class Animal {
    private String name;
    private int age;
    private String enclosure;
    private int health;
    private int hunger;
    private String mood;

    public Animal(String name, int age, String enclosure){
        this.name = name;
        this.age = age;
        this.enclosure = enclosure;
        this.health = 100;
        this.hunger = 0;
        this.mood = "Calm";
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();

    public void performDailyRoutine(){
        eat();
        sleep();
        makeSound();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
