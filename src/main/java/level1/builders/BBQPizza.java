package level1.builders;

import level1.components.*;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class BBQPizza implements PizzaBuilder {
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

