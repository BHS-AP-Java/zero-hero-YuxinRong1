package edu.bhscs;

public class Table {

  private int width;
  private int height;

  public Table(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  // it starts from the offset
  public void draw(int offset) {
    // surface of the table
    for (int s = 0; s < offset; s++) System.out.print(" ");
    for (int i = 0; i < width; i++) System.out.print("=");
    System.out.println();

    // the legs of table
    for (int h = 0; h < height; h++) {
      for (int s = 0; s < offset; s++) System.out.print(" ");
      System.out.print("|");
      for (int i = 0; i < width - 2; i++) System.out.print(" ");
      System.out.println("|");
    }
  }

  // draw the table by draw()
  public void draw() {
    draw(0);
  }
}
