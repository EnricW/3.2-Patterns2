package builders;

import components.Dough;
import components.Ingredient;
import components.Size;

public interface PizzaBuilder {
    void setSize(Size size);
    void setDough(Dough dough);
    void addIngredient(Ingredient ingredient);
}
