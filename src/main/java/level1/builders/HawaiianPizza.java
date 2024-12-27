package level1.builders;

import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizza implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public Pizza getResult(){
        return new Pizza(size,dough, (ArrayList<Ingredient>) ingredients);
    }
}
