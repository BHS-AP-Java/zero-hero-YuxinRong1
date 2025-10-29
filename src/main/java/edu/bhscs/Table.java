package edu.bhscs;

public class Table {
  // fields and properties
  int legs;
  int width;

  // constructors
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    // THIS BIT...
    // INSIDE THE CURRLY BRACKETS.... { ... }
    // this is the actual action.... ...aka... how to do stuff.

  }

  // methods
  void draw() {

    for (int i = 0; i < this.legs; i++) {

      /*things it does*/
      System.out.println("=        =");
    }
    System.out.println("The cake is put on a table with " + this.legs + " legs");
  }
}
