#include <iostream>
using namespace std;

class Rectangle
{
    private:
    float longueur;
    float largeur;

public:
    Rectangle(float, float);
    float aire();
    float
     perimetre();
};

Rectangle::Rectangle(float L, float l)
{
    if (L<0)
    {
        L=L*(-1);
        longueur=L;
    }
    if (l<0)
    {
        l=l*(-1);
        largeur=l;
    }
}
float Rectangle::aire(){
    return longueur*largeur;
}
float Rectangle::perimetre(){
    return 2*(longueur*largeur);
}
class Cercle: private Rectangle{
    public:
    Cercle(float a);
    void changer_cote(float a);
};

