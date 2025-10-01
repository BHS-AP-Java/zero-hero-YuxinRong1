package edu.bhscs;

public class Store {
  String myString;
  String Location;
  String appearance;
  int Flavor;

  public Store(String appearance, String Location) {
    this.appearance = appearance;
    this.Location = Location;
    System.out.println(Location + "!");
    
  }

  public class Cake {}

  public int getFlavor() {
    return this.Flavor;
  }
}
