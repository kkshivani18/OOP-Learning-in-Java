package interfaces.foodrecommendation.dishes;

import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.interfaces.Spicy;
import interfaces.foodrecommendation.interfaces.VegOrNonVeg;

public class PaneerTikka extends FoodItem implements Spicy, VegOrNonVeg {

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
    public void showVegOrNonVegInfo(){
        System.out.println(getName() + " is Veg");
    }
}
