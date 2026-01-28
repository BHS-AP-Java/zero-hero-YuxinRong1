package edu.bhscs;

public class Cake {

  private int candle;
  private String name;
  private int width;
  private int height;
  private String frosting;

  // Constructor
  public Cake(int candle, String name) {
    this.candle = candle;
    this.name = name;
    this.height = 5;
    this.frosting = "#";
    this.width = Math.max(name.length() + 6, candle * 3);
  }

  // ===== Setters =====
  public void setHeight(int h) {
    this.height = h;
  }

  public void setFrosting(String f) {
    this.frosting = (f.length() == 0) ? "#" : f;
  }

  public int getCandle() {
    return candle;
  }

  public String getName() {
    return name;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  // ===== Draw cake on table =====
  public void draw(Table t) {

    int tableWidth = t.getWidth();
    int cakeWidth = width;

    int cakeOffset = 0;
    int tableOffset = 0;

    // here is two situations
    if (tableWidth >= cakeWidth) {
      // if the table is wider than the cake
      cakeOffset = (tableWidth - cakeWidth) / 2;
      tableOffset = 0;
    } else {
      // if the cake is wider than the table
      cakeOffset = 0;
      tableOffset = (cakeWidth - tableWidth) / 2;
    }

    // the candles from the top
    for (int s = 0; s < cakeOffset; s++) System.out.print(" ");
    int candleSpace = cakeWidth - candle;
    int leftSpace = candleSpace / 2;
    for (int i = 0; i < leftSpace; i++) System.out.print(" ");
    for (int i = 0; i < candle; i++) System.out.print("|");
    System.out.println();

    // the top of the cake
    for (int s = 0; s < cakeOffset; s++) System.out.print(" ");
    for (int i = 0; i < cakeWidth; i++) System.out.print("=");
    System.out.println();

    // the main part of the cake
    for (int h = 0; h < height; h++) {
      for (int s = 0; s < cakeOffset; s++) System.out.print(" ");
      System.out.print("|");

      if (h == height / 2) {
        // the name shows in the middle and the whole cake you can see
        int space = cakeWidth - name.length() - 2;
        int left = space / 2;
        int right = space - left;
        for (int i = 0; i < left; i++) System.out.print(frosting.charAt(0));
        System.out.print(name);
        for (int i = 0; i < right; i++) System.out.print(frosting.charAt(0));
      } else {
        for (int i = 0; i < cakeWidth - 2; i++) System.out.print(frosting.charAt(0));
      }

      System.out.println("|");
    }

    // botton part of the cake
    for (int s = 0; s < cakeOffset; s++) System.out.print(" ");
    for (int i = 0; i < cakeWidth; i++) System.out.print("-");
    System.out.println();

    // draw the table
    t.draw(tableOffset);
  }
}
