package interfaces.foodrecommendation.dishes;

import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.interfaces.Spicy;
import interfaces.foodrecommendation.interfaces.VegOrNonVeg;

public class ButterChicken extends FoodItem implements Spicy, VegOrNonVeg {

    public ButterChicken(){
        super("Butter Chicken", 550);
    }

    public void prepare(){
        System.out.println(" Chicken cooked in a spiced tomato and butter based gravy ");
    }

    public void showSpicy(){
        System.out.println(getName() + " | Spicy : High");
    }

    public void showVegOrNonVegInfo(){
        System.out.println(getName() + " is Non Veg");
    }
}
