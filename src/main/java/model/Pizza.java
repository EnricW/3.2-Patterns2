package model;

import components.Dough;
import components.Ingredient;
import components.Size;

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
