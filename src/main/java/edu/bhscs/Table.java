package edu.bhscs;

public class Table {
  // fields and properties
  int legs;
  int width;
  String leg;
  String top;


  // constructors
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.leg = "=";
    this.top = "=";
    // THIS BIT...
    // INSIDE THE CURRLY BRACKETS.... { ... }
    // this is the actual action.... ...aka... how to do stuff.

  }

  public void setleg(String leg) {
    this.leg = leg;
  }

  public void settop(String top) {
    this.top = top;
  }

  // methods
  void draw() {

    for (int i = 0; i < this.width; i++) {
      System.out.print(top);
      /*things it does*/

    }
    
    System.out.println();
    System.out.println("The cake is put on a table with " + this.legs + " legs");
  }
}
