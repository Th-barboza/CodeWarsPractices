public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    int blues = blueStart - bluePulled;
    int reds = redStart - redPulled;
    int total = reds + blues;
    
    return (float)blues / total;
  }
}