/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

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
    String result;
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
    String openSym = "("
    String symbol;
    for (int i = 0; i < s.length; i++) {
      symbol = s.substring(i, i + 1);
      if (symbol.equals("(") || (symbol.equals("")))
    }
  }


  //main method to test
  public static void main( String[] args )
  {
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
