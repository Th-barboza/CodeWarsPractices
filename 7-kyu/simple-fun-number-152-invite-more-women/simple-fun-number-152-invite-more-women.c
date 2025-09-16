#include <stddef.h>
#include <stdbool.h>
​
bool invite_more_women(const int array[/* count */], size_t count)
{
  int soma = 0;
  for(size_t i = 0; i < count; i++){
    soma += array[i];
  }
  if(soma > 0) return true;
  else return false;
}