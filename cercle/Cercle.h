#ifndef CERCLE_H
#define CERCLE_H
#include "Point.h"
class Cercle
{
Point centre;
int rayon;
public:
Cercle(Point &,int );
Cercle(int,int,int);
~Cercle();
void deplacer(int,int);
void afficher();
};
#endif // CERCLE_H