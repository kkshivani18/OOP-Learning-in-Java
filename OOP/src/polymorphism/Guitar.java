package polymorphism;

public class Guitar extends Instrument{

    @Override
    public void playSound(){
        System.out.println("Playing Guitar: Twang!");
    }
}
