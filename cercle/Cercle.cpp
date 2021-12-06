#include "Cercle.h"
//Cercle.cpp
#include "Point.h"
#include <iostream>
using namespace std;
Cercle::Cercle(Point & p0,int r):centre(p0),rayon(r){
cout << "Constructeur de Cercle avec 2 args "<< endl;
}
Cercle::Cercle(int x0,int y0,int r):centre(x0,y0),rayon(r) {
cout << "Constructeur de Cercle avec 3 args "<< endl;
}
Cercle::~Cercle() {}
void Cercle::deplacer(int dx, int dy){
this->centre.deplacer(dx,dy);
}
void Cercle::afficher(){
cout << "Le rayon = "<< rayon<< " et le centre est ";
this->centre.afficher();
}