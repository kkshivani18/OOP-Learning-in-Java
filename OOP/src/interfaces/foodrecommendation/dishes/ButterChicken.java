package interfaces.foodrecommendation.dishes;

import interfaces.foodrecommendation.annotations.ContainsAllergen;
import interfaces.foodrecommendation.annotations.RecommendedFor;
import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.interfaces.Spicy;
import interfaces.foodrecommendation.interfaces.VegOrNonVeg;
import interfaces.foodrecommendation.interfaces.Vegan;

@ContainsAllergen({"poultry"})
@RecommendedFor({"high-protein diet", "dairy-free", "post-workout"})
public class ButterChicken extends FoodItem implements Spicy, Vegan, VegOrNonVeg {

    public ButterChicken(){
        super("Butter Chicken", 550);
    }

    @Override
    public void prepare(){
        System.out.println(" Chicken cooked in a spiced tomato and butter based gravy ");
    }

    @Override
    public void showSpicy(){
        System.out.println(getName() + " | Spicy : High");
    }

    @Override
    public void showVeganInfo() {
        System.out.println("Vegan alternative for Chicken is Soy curls, Jackfruit");
    }

    @Override
    public void showVegOrNonVegInfo(){
        System.out.println(getName() + " is Non Veg");
    }
}
