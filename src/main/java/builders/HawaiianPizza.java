package builders;

import components.Dough;
import components.Ingredient;
import components.Size;
import model.Pizza;

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
