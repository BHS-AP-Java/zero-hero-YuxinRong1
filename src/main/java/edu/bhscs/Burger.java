package edu.bhscs;

public class Burger {

  public static String breadGuts() {
    String guts = "";
    for (int i = 0; i < 10; i++) {
      guts += "";
    }
    return guts;
  }

  public void draw() {

    for (int i = 0; i < 10; i++) {

      System.out.println("    // ===========\\");
      System.out.println("   // =============\\");
      System.out.println("  // ===============\\");
      System.out.println(" // =================\\");
      System.out.println("  // ===============\\");
      System.out.println("  // ===============\\");
      System.out.println("  // ================\\");

      System.out.println("burger");
    }
  }
}
