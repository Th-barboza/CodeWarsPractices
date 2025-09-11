public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        int solution;
        if(l == w){
          solution = l*w;
        }else{
          solution = (2*l)+(2*w);
        }
      return solution;
    }
}