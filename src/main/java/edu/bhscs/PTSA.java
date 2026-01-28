package edu.bhscs;

// Represents the school organization that collects money
public class PTSA {

  private int funds;

  public PTSA() {
    this.funds = 0;
  }

  public int getFunds() {
    return funds;
  }

  // PTSA receives money
  public void receiveMoney(int amount) {
    funds += amount;
    System.out.println("PTSA receives $" + amount + ". Total funds now: $" + funds);
  }
}
