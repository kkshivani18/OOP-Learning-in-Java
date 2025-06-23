package interfaces.foodrecommendation.base;

public abstract class FoodItem {
    private String name;
    private int calories;

    public FoodItem(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public abstract void prepare();

    @Override
    public String toString(){
        return name + "(" + "calories: " + calories + " kcal)";
    }
}
