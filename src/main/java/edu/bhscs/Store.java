// Yuxin Rong
// P2
// bake sale
// 9.29.2025

// We are gonna make a cake, it has so many different flavours which is so delicious.
// A baker is selling cakes in a bakery.
// there is a customer who buys the cake.
// And there is a PTSA who is gonna get the money.
// input:
// output: not sure about it, probably something I've mentioned above.
package edu.bhscs;

public class Store {
  // fields or properties.
  String myString;
  String Location;
  String appearance;
  int Flavor;

  // constuctor
  public Store(String appearance, String Location) {
    this.appearance = appearance;
    this.Location = Location;
    System.out.println(Location + "!");
  }

  // methods
  // Sell the cake
  Cake sellTheCake() {
    Flour myFlour = new Flour(8, 5);
    Cake myYummieCake = new Cake(myFlour);

    return myYummieCake;
  }
}
