package parties;

// o modificador "default" só é visível para classes que estão no mesmo pacote.

public class VIPparty {
  private int coffeeQuantity = 30;
  private int saltyQuantity = 30;

  public void entry() {
    drinkCoffee();
    eatSalty();
    drinkCoffee();
  }

  private void drinkCoffee() {
    coffeeQuantity--;

    System.out.println("Drink 1 litre of coffee!");
  };

  private void eatSalty() {
    saltyQuantity--;

    System.out.println("Ate 30 snacks!");
  };
}
