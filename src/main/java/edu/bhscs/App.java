package edu.bhscs;

public class App {

  public static void main(String[] args) {
    make_a_cake();
  }

  public static void make_a_cake() {

    // this will be the stuff the method does!
    System.out.println("This is my pretty birthday cake !");
    // this is the workspace for today!!!

    Baker bob = new Baker("Shay");
    Table t = new Table(3, 5);
    Cake bDay = bob.bakes(5, "Yuxin");
    bDay.draw(t);
    System.out.println(bob.sayName() + " is the baker of this cake");
    System.out.println("This cake is for "+ bDay.getName()+"'s "+ bDay.getCandle() + "th birthday");
  }
}
