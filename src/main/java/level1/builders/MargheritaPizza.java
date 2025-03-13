package level1.builders;

import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class MargheritaPizza implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, new ArrayList<>(ingredients));
    }
}