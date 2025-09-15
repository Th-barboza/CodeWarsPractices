public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int tam = arrayOfSheeps.length;
      int sheeps = 0;
      for(int i = 0; i<tam; i++){
        if(arrayOfSheeps[i] != null){
        if(arrayOfSheeps[i] == true) sheeps +=1;
        }
        }
      return sheeps;
    }
}