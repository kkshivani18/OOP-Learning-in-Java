package interfaces.foodrecommendation;

import interfaces.foodrecommendation.annotations.ContainsAllergen;
import interfaces.foodrecommendation.annotations.RecommendedFor;
import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.interfaces.Spicy;
import interfaces.foodrecommendation.interfaces.VegOrNonVeg;
import interfaces.foodrecommendation.interfaces.Vegan;

import java.util.List;

public class RecommendationSystem {
    public static void recommend(List<FoodItem> menu){
        for(FoodItem item : menu){
            System.out.println("Food: " + item);
            item.prepare();

            if(item instanceof Vegan) {
                ((Vegan) item).showVeganInfo();
            }

            if(item instanceof Spicy) {
                ((Spicy) item).showSpicy();
            }

            if(item instanceof VegOrNonVeg) {
                ((VegOrNonVeg) item).showVegOrNonVegInfo();
            }

            Class<?> clazz = item.getClass();
            if(clazz.isAnnotationPresent(ContainsAllergen.class)){
                ContainsAllergen allergen = clazz.getAnnotation(ContainsAllergen.class);
                System.out.println("Allergens: " + String.join(", ", allergen.value()));
            }

            if(clazz.isAnnotationPresent(RecommendedFor.class)){
                RecommendedFor recommend = clazz.getAnnotation(RecommendedFor.class);
                System.out.println("Recommended for: " + String.join(", ", recommend.value()));
            }
            System.out.println("---------------------------------------------------------");
        }
    }
}
