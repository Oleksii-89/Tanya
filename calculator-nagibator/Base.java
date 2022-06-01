public class Base {

  // How many russian orks need to attack one Ukrainian soldier.
  public int ukrRuRatio (int ukr, int orksRu) {
    int orks;
    orks = ukr * 10;
    return orks;
  }

  // How many costs orks life
  public int orkCost(int orks) {
    int orksLife;
    orksLife = orks * 0;
    return orksLife;
  }
}