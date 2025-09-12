public class Kata {
    public static boolean isUpperCase(String s) {
        String min = "abcdefghijklmnoprstuvwxyz";
      for(int i = 0; i<s.length(); i++){
        for(int j = 0; j<min.length(); j++){
          if(s.charAt(i) == min.charAt(j)) return false;
        }
      }
      return true;
    }
}