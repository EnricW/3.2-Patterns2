package level1.builders;

import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;

public interface PizzaBuilder {
    void setSize(Size size);
    void setDough(Dough dough);
    void addIngredient(Ingredient ingredient);
}
