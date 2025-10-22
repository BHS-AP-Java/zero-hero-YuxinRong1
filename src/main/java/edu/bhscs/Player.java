package edu.bhscs;

import java.util.Scanner;

// fields and properties
public class Player {
  String name;
  Scanner s;

  //  constructor
  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  // methods
  public void answerQuestions() {
    System.out.println("What is your question?");
    String question = this.s.next();
    System.out.println(question + " is a dumb question!");
  }
}
