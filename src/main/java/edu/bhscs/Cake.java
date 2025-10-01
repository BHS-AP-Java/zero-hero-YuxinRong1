package edu.bhscs;

public class Cake {
  String TheOneBestCake;
  String ingredient;
  String otherIngredient;
  Flour flour;
  int Flour;
  int weight;


  // I have to make a constructor
  public Cake(String ingredient, Flour flour) {

    System.out.println("baking the cake..." + ingredient);
    this.weight = 10;
    this.Flour = 5;
  }

  // To be eaten
  public void eaten() {
    this.weight = this.weight - 2;
  }

  // To be weighted
  public int getWeight() {
    return this.weight;
  }

  public int flour() {
    return this.Flour;
  }
}
