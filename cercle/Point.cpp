#include "Point.h"
//Point.cpp
#include <iostream>
using namespace std;
Point::Point(int x0,int y0):x(x0),y(y0){
cout << "Constructeur de Point "<< endl;
}
Point::Point(Point & p1):x(p1.x),y(p1.y){
cout << "Constructeur de recopie de Point "<< endl;
}
Point::~Point(){}
void Point::afficher(){
cout << "(x = "<< x<< " et y = "<< y<<")"<< endl;
}
void Point::deplacer(int dx,int dy){
x+=dx;
y+=dy;
}