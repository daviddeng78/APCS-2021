/**
 *Disc Jockey: David Deng, Jaylen Zeng
 *APCS
 *L00 -- Etterbay Odingcay Oughthray Ollaborationcay
 *2021-11-08
 *
 *
 *DISCO
 *
 *QCC
 *
 */

public class Pig {

  private static final String VOWELS = "aeiou";
  private static final String PUNC = ".,!;-%$?:"; //add any punctuation marks that might be missing

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
    String lowerw = w.toLowerCase(); //try to combine lowercase and nonpunctuation into this one line

    if ( beginsWithVowel(w) )
      ans = w + "way";

    //accounts for case when all other vowels are not present and only 'y' is
    else if (!hasAVowel(w)) {
      int yPos = w.indexOf('y');

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
      return ans; 
    }

    return ans;
  }

  public static void main( String[] args ) {

    String translated = "";
    for( String word : args ) {
      translated += engToPig(word) + " ";
      System.out.println( word + " \t" + engToPig(word) );
    }
    System.out.println(translated);

  }//end main()

}//end class Pig
