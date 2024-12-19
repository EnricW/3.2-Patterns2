package director;

import builders.PizzaBuilder;
import components.Dough;
import components.Ingredient;
import components.Size;

public class PizzaChef {

    public void constructBBQPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(Size.MEDIUM);
        pizzaBuilder.setDough(Dough.THIN);
        pizzaBuilder.addIngredient(Ingredient.TOMATO);
        pizzaBuilder.addIngredient(Ingredient.MOZZARELLA);
        pizzaBuilder.addIngredient(Ingredient.HAM);
        pizzaBuilder.addIngredient(Ingredient.MUSHROOMS);
        pizzaBuilder.addIngredient(Ingredient.SALAMI);
    }

    public void constructMargheritaPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(Size.SMALL);
        pizzaBuilder.setDough(Dough.THICK);
        pizzaBuilder.addIngredient(Ingredient.TOMATO);
        pizzaBuilder.addIngredient(Ingredient.MOZZARELLA);
    }

    public void constructPepperoniPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(Size.LARGE);
        pizzaBuilder.setDough(Dough.THIN);
        pizzaBuilder.addIngredient(Ingredient.TOMATO);
        pizzaBuilder.addIngredient(Ingredient.MOZZARELLA);
        pizzaBuilder.addIngredient(Ingredient.PEPPERONI);
    }

    public void constructHawaiianPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(Size.MEDIUM);
        pizzaBuilder.setDough(Dough.THICK);
        pizzaBuilder.addIngredient(Ingredient.TOMATO);
        pizzaBuilder.addIngredient(Ingredient.MOZZARELLA);
        pizzaBuilder.addIngredient(Ingredient.HAM);
        pizzaBuilder.addIngredient(Ingredient.PINEAPPLE);
    }
}
