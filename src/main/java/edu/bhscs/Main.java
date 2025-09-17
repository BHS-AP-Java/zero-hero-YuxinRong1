package edu.bhscs;
public class Main {
  public static final float MAME_OF_THIS_FLOAT = 69.42f;

  public static final char A = 'a';
  public static void main(String[] args) {

    System.out.println(A);
    String myString = pushup("Garlic");
    System.out.println(myString);

    Awesome Steve = new Awesome("Steve");
    Awesome Sue = new Awesome("Sue");
    Awesome Linda = new Awesome("L");
    Awesome Jhon = new Awesome("With a JH,damb-ass");

    System.out.println( Steve.getblame() );

  }
  public static String pushup(String food){
    return "sweet" + food;
  }
}
