#include <iostream>
#include "Point.h"
#include "Cercle.h"
using namespace std;
int main()
{
Point a(2,2);
Cercle cr(a,5);
Cercle cr2(7,7,2);
//cr=cr2;
return 0;
}