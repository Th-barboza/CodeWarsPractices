#include <stdbool.h>
​
bool is_uppercase(const char *source) {
  const char *low = "abcdefghijklmnoprstuvwxyz";
  
  for(int i = 0; source[i] != '\0'; i++){
    for(int j = 0; low[j] != '\0'; j++){
      if(source[i] == low[j]) return false;
      }
    }
  return true;
}