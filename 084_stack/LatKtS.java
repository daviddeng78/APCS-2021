// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW84 -- Stack: What Is It Good For?
// 2022-03-29
// time spent: 0.5 hrs

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

//DISCO
// Collaboration nation. Building the best algorithm, or what we hope to be the best, came from the contributions of all people.
// Our brains were blown by each other's collaborations to the algorithm.

//QCC

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes ruawatrain = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      ruawatrain.push(s.substring(i, i + 1));
    }
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      result += ruawatrain.pop();
    }
    return result;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes open = new Latkes(s.length());
    String openSym = "({[";
    String parens = "()[]{}";
    String symbol;
    for (int i = 0; i < s.length(); i++) {
      symbol = s.substring(i, i + 1);
      if (openSym.contains(symbol)) {
        open.push(symbol);
      }
      else {
          symbol = open.pop() + symbol; //courtesy of TJM
          if (!parens.contains(symbol)) { 
              return false;
          }
      }
    }
    return open.isEmpty();
  }


  //main method to test
  public static void main( String[] args )
  {
    
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
