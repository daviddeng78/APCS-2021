/**
 *Princess Peach: David Deng, Jaylen Zeng, Paul Serbanescu, Yuki Feng
 *APCS
 *HW25 -- Do I repeat myself? / While Loops and Recursion
 *2021-10-26
 *Time Spent: .5 hours
 *
 *
 *DISCO
 *You can call a method within itself. (See fenceR)
 *QCC
 *No unresolved questions.
 */

class Repeater {


  public static String fenceW(int numPosts) {
    int count = 0;
    String result = "";
    while (count < numPosts) {
      if ((numPosts-count) == 1) {
        result = result + "|";
        count = count + 1;}
      else {
        result = result + "|--";}
        count = count + 1;

    }
    return result;
  }

  public static String fenceR(int numPosts) {
    String result = "";
    if (numPosts == 1) {
      result = result + "|";
      return result;
      }
    else {
      result = "|--" + fenceR(numPosts-1);
      return result;
      }
    }


  public static void main(String[] args) {
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));
    System.out.println("-------");
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));
  }
}
