package edu.bhscs;

public class Cake {

  // fields and properties

  String ingredient;
  String otherIngredient;
  String frosting;
  String Cake;
  int height;
  int width;
  String bakes;
  int people;
  String name;

  public Cake(String name, int people) {
    this.height = 5;
  }

  public String saySize() {
    return this.name;
  }

  void draw() {
    for (int i = 1; i <= 4; i++) {

      System.out.println("============");
    }
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print("@@&@@");
      }
      System.out.println("=");
    }
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        System.out.print("##@##");
      }
      System.out.println("-");
    }
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print("[%%-%%]");
      }
      System.out.println("+\\");
    }
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print("-^^^^^^+");
      }
      System.out.println("/");
    }
  }

  public void draw(Table t) {
    this.draw();
    t.draw();
  }
}
