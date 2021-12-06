#include <iostream>
using namespace std;

class Point
{
    int x;
    int y;
public:
    Point(int abs=0, int ord=0)
{
    cout<<"++constr. point: "<<abs<<","<<ord<<endl ;
    x=abs ; y=ord ;
}
~Point()
{
    cout <<"—desctr. point: "<<x<<","<<y<<endl ;
}
};
class Pointcol: public Point
{
int couleur;
public:
Pointcol(int , int , int) ;
    ~Pointcol (){
        cout<<"—destr. pointcol -couleur: "<<couleur<<endl ;
    }
};
Pointcol::Pointcol(int abs=0,int ord=0,int c=1):Point(abs,ord){
    couleur=c;
    cout <<"\t++constr. pointcol: "<<abs<<"," <<ord<<","<<couleur;
}
int main()
{
    Pointcol a(10,15,3) ;
    Pointcol b(2,3) ;
    Pointcol c(12) ;
    Pointcol *adr;
    adr = new Pointcol(12,25);
    delete adr ;
return 0;
}