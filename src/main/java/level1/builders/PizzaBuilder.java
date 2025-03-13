package level1.builders;

import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;
import level1.model.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder addIngredient(Ingredient ingredient);
    Pizza build();
}
