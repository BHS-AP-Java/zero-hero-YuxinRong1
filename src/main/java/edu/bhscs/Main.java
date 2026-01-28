// Yuxin Rong
// P2
// Make a cake
// 1/23/2026

/*
 * This assignment is to use java to make a cake. and I have to make a 2-d picture of this cake;
 * I'd better to let it reflect at least one properties or fields
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {
    make_a_cake();
  }

  public static void make_a_cake() {

    // this will be the stuff the method does!
    System.out.println("This is my pretty birthday cake !");
    // this is the workspace for today!!!

    Baker bob = new Baker("Shay");
    Table t = new Table(3, 2);
    Cake bDay = bob.bakes(6, " Yuxin ");
    bDay.setHeight(8);
    bDay.setFrosting("X");
    bDay.draw(t);
    System.out.println(bob.sayName() + " is the baker of this cake");

    // Create Customer and PTSA

    Customer customer = new Customer("Carrie", 50);
    PTSA ptsa = new PTSA();

    // Simulate purchase

    int cakePrice = 20;
    System.out.println(
        "\nCustomer " + customer.getName() + " is buying the cake for $" + cakePrice);
    customer.pay(cakePrice);
    ptsa.receiveMoney(cakePrice);

    // Modify cake over time (optional for A-range)

    System.out.println("\nCake gets an extra candle for celebration!");
  }
}
