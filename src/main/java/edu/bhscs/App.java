package edu.bhscs;

/*
 * DemoApp.java Goals: - Demonstrate Cake creation and drawing on a table - Show interactions
 * between Baker, Customer, and PTSA - Show state changes over time
 *
 * Inputs: - Baker name - Customer name and money - Cake parameters (candles, name, height,
 * frosting)
 *
 * Outputs: - ASCII Cake on table - Customer payment and cake receipt - PTSA funds update
 */

public class App {

  public static void main(String[] args) {

    // Create Baker
    Baker baker = new Baker("Shay");

    // Create Table
    Table table = new Table(25, 4);

    // Create Cake
    Cake cake = baker.bakes(5, "Yuxin");
    cake.setHeight(6);
    cake.setFrosting("*");

    // Draw Cake on Table
    cake.draw(table);

    // Create Customer and PTSA
    Customer customer = new Customer("Alice", 50);
    PTSA ptsa = new PTSA();

    // Simulate purchase
    int price = 20;
    System.out.println("\nCustomer " + customer.getName() + " buys the cake for $" + price);
    customer.pay(price);
    ptsa.receiveMoney(price);
    customer.receiveCake(cake);

    // Display final state at bottom of cake
    System.out.println("\n--- Transaction Summary ---");
    System.out.println("Baker: " + baker.sayName());
    System.out.println("Customer: " + customer.getName() + ", Money Left: $" + customer.getMoney());
    System.out.println("PTSA Funds: $" + ptsa.getFunds());

    // Modify cake over time
    System.out.println("\nCake celebration: add 1 more candle!");
    cake = baker.bakes(cake.getCandle() + 1, cake.getName());
    cake.setHeight(6);
    cake.setFrosting("*");

    // Draw updated cake and re-show table
    cake.draw(table);

    // Re-print final state
    System.out.println("\n--- Updated Transaction Summary ---");
    System.out.println("Baker: " + baker.sayName());
    System.out.println("Customer: " + customer.getName() + ", Money Left: $" + customer.getMoney());
    System.out.println("PTSA Funds: $" + ptsa.getFunds());
  }
}
