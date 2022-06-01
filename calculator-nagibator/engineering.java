public class engineering extends Base{
  // How many orks need to build a one little trench

  public int trench(int length, int hours) {
    // Need orks
    int metersPerHour = 5;
    int orks;
    orks = (length / hours) * metersPerHour;
    return orks;
  }
}
