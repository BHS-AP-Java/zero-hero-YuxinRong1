package edu.bhscs;

public class Baker {

  String name;

  // fields and properties
  Baker(String name) {
    this.name = name;
  }


  Cake bakes(int candle, String customer) {

    return new Cake(candle, customer);
  }

  String menu = "chocolate cake, strewberry cake, lemon cake";

  // constructors

  public String sayMenu() {
    return menu;
  }

  // methods

  public String sayName() {
    return name;
  }
}
