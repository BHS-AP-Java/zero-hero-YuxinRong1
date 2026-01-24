// Yuxin Rong
// P2
// Make a cake
// 10/9/2025

/*
 * This assignment is to use java to make a cake. and I have to make a 2-d picture of this cake;
 * I'd better to let it reflect at least one properties or fields
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {
    make_a_cake();
  }

  public static void make_a_cake() {

    // this will be the stuff the method does!
    System.out.println("This is my pretty birthday cake !");
    // this is the workspace for today!!!

    Baker bob = new Baker("Shay");
    Table t = new Table(4, 2);
    Cake bDay = bob.bakes(6, " Yuxin ");
    bDay.setHeight(8);
    bDay.setFrosting("&");
    bDay.draw(t);
    System.out.println(bob.sayName() + " is the baker of this cake");
    System.out.println(
        "This cake is for " + bDay.getName() + "'s " + bDay.getCandle() + "th birthday");
  }
}
