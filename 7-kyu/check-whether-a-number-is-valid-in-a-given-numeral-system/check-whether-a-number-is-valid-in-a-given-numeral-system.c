#include <stdbool.h>
​
bool validate_base(const char *num, unsigned base) {
  char bases[36] = {'0','1','2','3','4','5','6','7','8','9',
                      'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'
                        ,'R','S','T','U','V','W','X','Y','Z'};
  int i = 0;
    while(num[i] != '\0'){
      for(int j = 0; bases[j+base] != '\0'; j++){
        if(num[i] == bases[j+base]) return false;
      }
      i++;
    }
  
    return true;
}