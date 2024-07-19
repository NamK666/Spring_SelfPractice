package LooseCoupling;

public class Barista {
    private CoffeeMachine coffeeMachine;

    public Barista(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeEspresso() {
        System.out.println("바리스타가 에스프레소를 만듭니다.");
        coffeeMachine.brewEspresso();
    }
}
