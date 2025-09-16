float guess_blue(int blueStart, int redStart, int bluePulled, int redPulled)
{
  if(blueStart < bluePulled || redStart < redPulled)  return -1;
  int blue = blueStart - bluePulled;
  int red = redStart - redPulled;
  int total = red + blue;
  float probability = (float) blue / (float) total;
  return probability;
}