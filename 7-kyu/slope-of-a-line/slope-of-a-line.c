#include <stdbool.h>
​
typedef struct Double_Point_Coordinates {
    double x;
    double y;
} point;
​
double get_slope(point a, point b, bool *is_slope) {
  double slope;
  if(a.x == b.x){
    *is_slope = false;
    return 0.0;
  }  
  slope = (a.y - b.y) / (a.x - b.x);
  return slope;
}