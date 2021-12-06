#include <iostream>
using namespace std;

class Forme{
    int x;
    int y;
    public:
    Forme(int x, int y){
        this->x=x ; this->y=y ;}
        void deplacer(int dx, int dy)
        {
        x+=dx;y+=dy ; }
    };
    class Cercle: public Forme{
        int rayon;
        public:
        Cercle(int x, int y, int r):Forme(x, y)
        {
        rayon=r ; 
    }
    void agrandir(int a){
        rayon+=a; 
    }
};
int main()
{
Forme f1(2,3); //1//
Cercle c1(15, -1, 50) ; //2//
c1.deplacer(3, 4) ; //3//
c1.agrandir(10) ; //4//
f1=c1 ; //5//
f1.deplacer(5, -8) ; //6//
//c1=f1 ; 
return 0;
}