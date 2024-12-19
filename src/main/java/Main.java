import builders.BBQPizza;
import builders.HawaiianPizza;
import builders.MargheritaPizza;
import builders.PepperoniPizza;
import director.PizzaChef;
import model.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaChef chef = new PizzaChef();

        BBQPizza bbqPizza = new BBQPizza();
        chef.constructBBQPizza(bbqPizza);
        Pizza pizza = bbqPizza.getResult();
        System.out.println("BBQ: "+pizza.toString());

        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        chef.constructPepperoniPizza(pepperoniPizza);
        pizza = pepperoniPizza.getResult();
        System.out.println("Pepperoni: "+pizza.toString());

        MargheritaPizza margheritaPizza = new MargheritaPizza();
        chef.constructMargheritaPizza(margheritaPizza);
        pizza = margheritaPizza.getResult();
        System.out.println("Margherita: "+pizza.toString());

        HawaiianPizza hawaiianPizza = new HawaiianPizza();
        chef.constructHawaiianPizza(hawaiianPizza);
        pizza = hawaiianPizza.getResult();
        System.out.println("Hawaiian: "+pizza.toString());
    }
}
