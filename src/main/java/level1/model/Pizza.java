package level1.model;

import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;

import java.util.ArrayList;

public class Pizza {
    private final Size size;
    private final Dough dough;
    private final ArrayList<Ingredient> ingredients;

    public Pizza(Size size, Dough dough, ArrayList<Ingredient> ingredients) {
        this.size = size;
        this.dough = dough;
        this.ingredients = ingredients;
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String toString() {
        return " {" +
                "size=" + size +
                ", dough=" + dough +
                ", ingredients=" + ingredients +
                '}';
    }
}
