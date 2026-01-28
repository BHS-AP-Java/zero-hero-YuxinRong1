package edu.bhscs;

import java.util.Scanner;

public class Player {

  public Player(String unused) {}

  public String giveAnswer(String question) {
    System.out.println(question);
    return ScannerHolder.SCANNER.nextLine();
  }

  private static class ScannerHolder {
    private static final Scanner SCANNER = new Scanner(System.in);
  }
}
