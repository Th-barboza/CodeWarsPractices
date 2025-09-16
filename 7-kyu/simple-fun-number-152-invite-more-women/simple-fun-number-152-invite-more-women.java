public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        int soma = 0;
  for(int i = 0; i < l.length; i++){
    soma += l[i];
  }
  if(soma > 0) return true;
  else return false;
    }
}