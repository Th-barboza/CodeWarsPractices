public class Solution {
  public static boolean validateBase(String num, int base) {
    char[] bases = {'0','1','2','3','4','5','6','7','8','9',
                      'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'
                        ,'R','S','T','U','V','W','X','Y','Z'};
 for (int i = 0; i < num.length(); i++) {
    char caractere = num.charAt(i);
      for(int j = 0; j + base < bases.length; j++){
        if(caractere == bases[j+base]) return false;
      }
    }
  
    return true;
  }
}