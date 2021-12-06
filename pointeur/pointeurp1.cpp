#include <iostream>
using namespace std;
int main(){
    int x ; // une déclaration
    x = 3 ; // une affectation
    int * p ; // un pointeur sur un entier
    p = &x ; // p vaut l’adresse de x
    int y = *p ; // y vaut 3
    cout<< x << " " << y << " " << p << " " <<endl;
return 0;
}