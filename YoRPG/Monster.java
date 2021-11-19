public class Monster {
  public int hp;
  public int dmg;

  public Monster() {
    hp = 100;
  }

  public boolean isAlive() {
    return hp > 0;
  }

  public int attack(Protagonist target) {
    dmg = (int) (Math.random() * 500);
    target.hp -= dmg;
    return dmg;
  }
}
