package level1.director;

import level1.builders.PizzaBuilder;
import level1.components.Dough;
import level1.components.Ingredient;
import level1.components.Size;
import level1.model.Pizza;

public class PizzaChef {

    public Pizza makeBBQPizza(PizzaBuilder pizzaBuilder) {
        return pizzaBuilder.setSize(Size.MEDIUM)
                .setDough(Dough.THIN)
                .addIngredient(Ingredient.TOMATO)
                .addIngredient(Ingredient.MOZZARELLA)
                .addIngredient(Ingredient.HAM)
                .addIngredient(Ingredient.MUSHROOMS)
                .addIngredient(Ingredient.SALAMI)
                .build();
    }

    public Pizza makeMargheritaPizza(PizzaBuilder pizzaBuilder) {
        return pizzaBuilder.setSize(Size.SMALL)
                .setDough(Dough.THICK)
                .addIngredient(Ingredient.TOMATO)
                .addIngredient(Ingredient.MOZZARELLA)
                .build();
    }

    public Pizza makePepperoniPizza(PizzaBuilder pizzaBuilder) {
        return pizzaBuilder.setSize(Size.LARGE)
                .setDough(Dough.THIN)
                .addIngredient(Ingredient.TOMATO)
                .addIngredient(Ingredient.MOZZARELLA)
                .addIngredient(Ingredient.PEPPERONI)
                .build();
    }

    public Pizza makeHawaiianPizza(PizzaBuilder pizzaBuilder) {
        return pizzaBuilder.setSize(Size.MEDIUM)
                .setDough(Dough.THICK)
                .addIngredient(Ingredient.TOMATO)
                .addIngredient(Ingredient.MOZZARELLA)
                .addIngredient(Ingredient.HAM)
                .addIngredient(Ingredient.PINEAPPLE)
                .build();
    }
}

