package edu.bhscs;

public class Store {
//fields or properties.
  String myString;
  String Location;
  String appearance;
  int Flavor;

  //constuctor
  public Store(String appearance, String Location) {
    this.appearance = appearance;
    this.Location = Location;
    System.out.println(Location + "!");
  }

  //methods
  //Sell the cake
  Cake sellTheCake(){
    Flour myFlour = new Flour(8,5);
    Cake myYummieCake = new Cake("Baccon", myFlour);

    return myYummieCake;
    
  }

}
