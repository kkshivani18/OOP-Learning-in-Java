package interfaces.foodrecommendation;

// Build a simulation of a food recommendation system that recommends meals to users based on
// dietary preferences, calorie limits, and allergy restrictions — all handled via abstract classes,
// interfaces and annotations.

import interfaces.foodrecommendation.base.FoodItem;
import interfaces.foodrecommendation.dishes.ButterChicken;
import interfaces.foodrecommendation.dishes.PaneerTikka;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> item = new ArrayList<>();
        item.add(new PaneerTikka());
        item.add(new ButterChicken());

        RecommendationSystem.recommend(item);
    }
}
