package edu.bhscs;

public class Baker {
  String name;

  // fields and properties
  Baker(String name) {
    this.name = name;
  }

  String menu = "chocolate cake, strewberry cake, lemon cake";

  // constructors

  public String sayMenu() {
    return menu;
  }

  // methods
  Cake bakes(int people, String name) {
    return new Cake(name, people);
  }

  public String sayName() {
    return name;
  }
}
