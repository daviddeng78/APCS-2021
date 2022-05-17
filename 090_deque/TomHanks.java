// ruawatrain: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 1 hrs

public class TomHanks {
  public static void main(String[] args) {
    PolarExpress<String> ruawatrain = new PolarExpress<String>();
    System.out.println(ruawatrain.size());
    ruawatrain.addFirst("Ben");
    ruawatrain.addFirst("David");
    ruawatrain.addFirst("Josiah");
    ruawatrain.addLast("Ben");
    ruawatrain.addLast("David");
    ruawatrain.addLast("Josiah");
    System.out.println("The screams of " + ruawatrain.removeFirst() + " can be heard as he falls out the window!");
    ruawatrain.removeLast();
    System.out.println("The status of Josiah on this train: " + ruawatrain.contains("Josiah"));
  }
}
