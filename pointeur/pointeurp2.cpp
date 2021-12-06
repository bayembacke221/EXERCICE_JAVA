#include <iostream>
using namespace std;
int main(int argc, const char** argv) {
    int a, b=5, c, d=3;
    int *p1, *p2, *p3;
    p2=&a ;
    *p2=d*2;
    p1=&c;
    *p1= *p2+ 3;
    p3=p1;
    p1=p2;
    cout<< a << " " << b << " " << c << " " << d <<endl;
    return 0;
}