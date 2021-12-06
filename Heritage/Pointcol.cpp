#include <iostream>
using namespace std;

class Point{
    int x;
    int y;
    public:
    void initialise (int a , int b) {
        x=a;
        y=b;
    }
    void afficher() {
        cout<<"("<<x<<","<<y<<")"<<endl;
    }
};
class Pointcol: public Point{
    int couleur;
    public:
    void setcol(int c){
        couleur=c ;
    }
    void affichagec(){
        afficher();
        cout<<"couleur:"<<couleur<<endl;
    }
};
int main(){
    Pointcol p ;
    p.initialise (10,20) ;
    p.setcol(5) ;
    p.afficher() ;// (10, 20)
    p.affichagec();
}