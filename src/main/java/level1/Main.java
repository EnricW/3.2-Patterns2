package level1;

import level1.builders.BBQPizza;
import level1.builders.HawaiianPizza;
import level1.builders.MargheritaPizza;
import level1.builders.PepperoniPizza;
import level1.director.PizzaChef;
import level1.model.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaChef chef = new PizzaChef();

        Pizza bbqPizza = chef.makeBBQPizza(new BBQPizza());
        System.out.println("BBQ: " + bbqPizza);

        Pizza pepperoniPizza = chef.makePepperoniPizza(new PepperoniPizza());
        System.out.println("Pepperoni: " + pepperoniPizza);

        Pizza margheritaPizza = chef.makeMargheritaPizza(new MargheritaPizza());
        System.out.println("Margherita: " + margheritaPizza);

        Pizza hawaiianPizza = chef.makeHawaiianPizza(new HawaiianPizza());
        System.out.println("Hawaiian: " + hawaiianPizza);
    }
}

