package interfaces.foodrecommendation.dishes;

import interfaces.foodrecommendation.annotations.ContainsAllergen;
import interfaces.foodrecommendation.annotations.RecommendedFor;
import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.interfaces.Spicy;
import interfaces.foodrecommendation.interfaces.Vegan;
import interfaces.foodrecommendation.interfaces.VegOrNonVeg;

@ContainsAllergen({"dairy"})
@RecommendedFor({"high protein diet"})
public class PaneerTikka extends FoodItem implements Spicy, Vegan, VegOrNonVeg {

    public PaneerTikka(){
        super("Paneer Tikka", 450);
    }

    @Override
    public void prepare() {
        System.out.println("Grill paneer with spices");
    }

    @Override
    public void showSpicy(){
        System.out.println(getName() + " | Spicy: Medium");
    }

    @Override
    public void showVeganInfo() {
        System.out.println("Vegan alternative for Paneer is Tofu");
    }

    @Override
    public void showVegOrNonVegInfo(){
        System.out.println(getName() + " is Veg");
    }
}
