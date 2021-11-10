/**
 *Disc Jockey: David Deng, Jaylen Zeng, Michael Kaml
 *APCS
 *L00 -- Etterbay Odingcay Oughthray Ollaborationcay
 *2021-11-08
 *
 *
 *DISCO
 *
 *QCC
 * How would one address the case where there is a blank line present in 'words.in'?
 *
 *HOW WE UTILIZED SCANNER DEMO (v2):
 *We read each word individually from the stdin and translated it to pig latin and printed the result of each word.
 *
 *WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO:
 *In the scanner demo, the method sc.next() is called twice in the main method. Everytime this method is called, the scanner moves to the next line. Therefore, this causes an error because if you have an uneven amount of words in your 'words.in' file, when scanner tries to go to the next line, it will eventually run into a nonexistent line. 
 *
 *NEW IN v2:
 *Functional scanner if file contains no blank lines in between words.
 *Fixed translator so it accounts for words with no vowels and does not contain the letter 'y'
 */

import java.util.Scanner;

public class Pig {

  private static final String VOWELS = "aeiou";
  private static final String PUNC = ".,!;-%$?:";

  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }

  public static int countVowels( String w ) {

    return allVowels(w).length();
  }


  public static boolean hasAVowel( String w ) {
    return (countVowels(w) > 0);
  }


  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }

  public static boolean hasPunc(String w) {
    return PUNC.indexOf(w.substring(w.length()-1)) != -1;
  }

  public static String engToPig( String w ) {

    String ans = "";

    //converts entire string to lowercase
    String lowerw = w.toLowerCase(); 

    //accounts for case when all other vowels are not present and only 'y' is
    if (!hasAVowel(w)) {
      int yPos = w.indexOf('y');

      //accounts for case where word (e.g. zzz) has no vowels at all
      if (yPos == -1)
      {
        return w;
      }
      //if y is present at beginning of word
      if (yPos == 0)
      {
        ans = w + "way";
      }

      //if y is present anywhere else
      else 
      {
        ans = lowerw.substring(yPos) + lowerw.substring(0, yPos) + "ay";
      }
    }

    else 
    {
      int vPos = w.indexOf( firstVowel(w) );
      ans = lowerw.substring(vPos) + lowerw.substring(0,vPos) + "ay";
    }
    

    //changes first letter to capital if w starts with a capital letter
    if (!lowerw.equals(w))
    {
      ans = ans.substring(0, 1).toUpperCase() + ans.substring(1);
    }

    //checks for punctuation
    if (hasPunc(w)) {
      ans = engToPig(w.substring(0,w.length()-1)) + w.substring(w.length()-1); 
    }

    return ans;
  }

  public static void main( String[] args ) {

    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()) 
    {
      System.out.println(engToPig(sc.next()));
    }
    
    sc.close();
    //Old translation code
    /*String translated = "";
    while ()
      translated += engToPig(word) + " ";
      System.out.println( word + " \t" + engToPig(word) );
    }
    System.out.println(translated); 
    */

  }//end main()

}//end class Pig
