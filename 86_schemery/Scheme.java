// Ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW86 -- What a Racket
// 2022-03-31
// time spent: 0.5 hrs

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Iterate through the expression character by character BACKWARDS (this is important)
 *   2. Add each non-opening paren to a stack
 *   3. Once we hit an open paren, pop and evaluate everything up to the most recent close paren
 *   4. Add the evaluated expression to the stack
 *   5. Continue until the stack contains a single number
 *
 * STACK OF CHOICE: ALStack by Mr. Mykolyk (?)
 * b/c ...
 **/

/*
 DISCO
 0. This algo is kinda sick.

 QCC
 0. THERES NO WAY THIS WORKED SO CLEANLY
*/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    String[] splut = expr.split("\\s+");
    Stack<String> ruawatrain = new ALStack();

    for (int i = splut.length - 1; i >= 0; i--) {
      if ( !splut[i].equals("(") ) {
        ruawatrain.push( splut[i] );
      }
      else {  // we don't even end up adding an open paren to the stack... ever
        String op = ruawatrain.pop(); // ensures that each if statement doesn't pop a symbol
                                      // additionally highlights a benefit of iterating backwards, since operands are at the top of the stack.
        if ( op.equals("+") ) {
          ruawatrain.push(unload( 1, ruawatrain ));
        }
        else if ( op.equals("-") ) {
          ruawatrain.push(unload( 2, ruawatrain ));
        }
        else {
          ruawatrain.push(unload( 3, ruawatrain ));
        }

        //System.out.println(ruawatrain)
      }
    }

    return ruawatrain.pop();
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )  // unload will also handle all of the back-popping
  {
    int result = Integer.parseInt( numbers.pop() );

    if (op == 1) {
      while ( !numbers.peekTop().equals(")") ) {
        result += Integer.parseInt( numbers.pop() );
      }
    }
    else if (op == 2) {
      while ( !numbers.peekTop().equals(")") ) {
        result -= Integer.parseInt( numbers.pop() );
      }
    }
    else if (op == 3) {
      while ( !numbers.peekTop().equals(")") ) {
        result *= Integer.parseInt( numbers.pop() );
      }
    }

    numbers.pop();  // pops off ")"
    return "" + result;
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
          /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
