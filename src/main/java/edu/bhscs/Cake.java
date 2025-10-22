package edu.bhscs;

public class Cake {

  String ingredient;
  String otherIngredient;
  String frosting;
  String Cake;
  int height;
  int width;

  public Cake() {}

  void draw(String icing, int x, int y) {

    for (int r = 0; r < width / 2; r++) {

      System.out.print(" ".repeat(width / 2 - r));
      System.out.print("/");
      System.out.print(icing.repeat(r * 2)); // frosting pattern
      System.out.println("\\");

    }

    for (int row = 0; row < height; row++) {
      System.out.print("|");
      for (int col = 0; col < width; col++) {
        // Pattern: sprinkle every 3rd column, crack every 5th column
        if (col % 3 == 0)
          System.out.print("*");
        else if (col % 5 == 0)
          System.out.print("/");

        else
          System.out.print("#"); 
      }

      System.out.println("|");

    }

    System.out.println("=".repeat(width + 2));

    System.out.println("This is your " + frosting + " cake! Enjoy! 🍰");

  }
}
