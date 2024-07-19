package LooseCoupling;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Barista barista = new Barista(coffeeMachine);

        barista.makeEspresso();
    }
}
