/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */

// If the substring does not occur in the string, it will return -1.
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumps over the lazy dog, but the crazy part is that the lazy dog is 5ft tall :O.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
    
    //This overloaded method of indexOf(String str, int fromIndex) only looks for occurences of 'str' after index 'fromIndex'. Returns -1 if not found.
    int psition = sample.indexOf("dog", 84);
    System.out.println(psition);
    /*Trace 
    findKeyWord("She's my sister", "sister", 0);
    Iteration     psn     before    after
      1            9        " "     " "
      
    findKeyWord("Brother Tom is helpful","brother", 0);
    Iteration     psn     before    after
      1            0       ""       " "
    
    findKeyWord("I can't catch wild cats.", "cat", 0 );
    Iteration     psn     before    after
      1            7       " "       "c"
      2           18       " "       "s"
    
    findKeyWord("I know nothing about snow plows.", "no", 0);
    Iteration     psn     before    after
      1            3        "k"       "w"
      2            7        " "       "t"
      3            21       "s"       "w" 
    */
	}
}
