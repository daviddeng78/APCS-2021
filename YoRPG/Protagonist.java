public class Protagonist {
  //instance variables
  public String name;
  public int hp;
  public int dmg;

  public Protagonist(String x) {
    name = x;
    hp = 100;
  }

  public String getName() {
    return name;
  }

  public boolean isAlive() {
    return hp > 0;
  }

  public void normalize() {
    dmg = (int) (Math.random() * 20);
  }

  public void specialize() {
    dmg = (int) (Math.random() * 20 * 1.5);
  }

  public int attack(Monster target) {
    target.hp -= dmg;
    return dmg;
  }

}
