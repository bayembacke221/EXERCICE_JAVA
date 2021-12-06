#ifndef POINT_H
#define POINT_H
class Point
{
int x,y;
public:
Point(int,int);
Point(Point &);
~Point();
void afficher();
void deplacer(int, int);
};
#endif // POINT_H