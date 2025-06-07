package polymorphism;

// Assignment: Virtual Musical Instrument Simulator
// Use polymorphism to simulate different musical instruments playing sounds, but all treated as Instrument type.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument> band = new ArrayList<>();
        band.add(new Instrument());
        band.add(new Guitar());
        band.add(new Piano());
        band.add(new Drums());

        for(Instrument i: band){
            i.playSound();
        }
    }
}
