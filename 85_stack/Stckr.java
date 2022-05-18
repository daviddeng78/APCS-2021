/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...
    System.out.println("Is cakes empty? " + cakes.isEmpty());

    cakes.push("1 cup (226 grams) unsalted butter, softened");
    cakes.push("2 cups (370 grams) granulated sugar");
    cakes.push("4 large eggs (200 grams), room temperature");
    cakes.push("3 cups (300 grams) cake flour");
    cakes.push("1 tablespoon (12 grams) baking powder");
    cakes.push("1 cup (240 grams) milk, room temperature");
    cakes.push("2 teaspoons vanilla extract");

    System.out.println("Is cakes empty? " + cakes.isEmpty());

    System.out.println("We need some " + cakes.peekTop() + "\nbut don't add too much " +  cakes.peekTop() + " or it will over power the dish");

    while ( !cakes.isEmpty() ) {
      System.out.println("Don't forget " + cakes.pop());
    }

    cakes.pop();
    cakes.peekTop();

    System.out.println("All done!");




  }//end main

}//end class
