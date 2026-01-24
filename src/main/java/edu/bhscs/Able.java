package edu.bhscs;

public class Able {

  private int width = 9;
  private int height = 5;

  public Able(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void draw() {

    // tabletop
    for (int i = 0; i < width; i++) {
      System.out.print("=");
    }
    System.out.println();

    // legs
    for (int h = 0; h < height; h++) {
      System.out.print("|");
      for (int i = 0; i < width - 2; i++) System.out.print(" ");
      System.out.println("|");
    }

    System.out.println();
  }
}
