package edu.bhscs;

public class Awesome {
  String name;
  String knowledge;

  public Awesome(String name) {
    System.out.println("I am the most Awesome " + name);
    System.out.println("I am Awesome");
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  String getblame() {
    return this.name;
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getknowledge() {
    return this.knowledge;
  }
}
