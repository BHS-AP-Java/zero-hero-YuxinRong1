package edu.bhscs;

public class Flour {
  // fields props
  int price;
  int lbs;
  int quality;

  // constructor
  public Flour(int price, int lbs) {
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
  }

  // methods
  public void goesbad() {
    this.quality = 8;
  }
}
