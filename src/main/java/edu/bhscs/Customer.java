package edu.bhscs;

// Represents a customer who buys cakes
public class Customer {

  private String name;
  private int money;

  public Customer(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public String getName() {
    return name;
  }

  public int getMoney() {
    return money;
  }

  // Customer pays for cake
  public void pay(int amount) {
    money -= amount;
    if (money < 0) money = 0;
  }

  // Customer receives cake
  public void receiveCake(Cake cake) {
    System.out.println(name + " receives a cake with " + cake.getCandle() + " candles!");
  }
}
