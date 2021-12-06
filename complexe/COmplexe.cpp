#include <iostream>
using namespace std;
class COmplexe
{
private:
    double x, y;
public:
    COmplexe(double , double);
    ~COmplexe();
    double get_x();
    double get_y();
    void operator+(COmplexe const& );
    
};
void COmplexe::operator+(COmplexe const& Z2){
    x+=Z2.x;
    y+=Z2.y;
}

COmplexe::COmplexe(double abcisse , double ordonnee):x(abcisse), y(ordonnee)
{
}

COmplexe::~COmplexe()
{
    cout<<"DESTRUCTION DU NOMBRE COMPLEXE\n"<<endl;
}
double COmplexe::get_x(){
    return x;
}
double COmplexe::get_y(){
    return y;
}
const COmplexe operator+(COmplexe z1, COmplexe const& z2) {
z1 =z1+ z2; // utilise l'opérateur += redéfini précédemment
return z1;
}
int main(int argc, char const *argv[])
{
    COmplexe z1(2.0,1.0);
    COmplexe  z2(3.5,5.0);
    COmplexe tmp(z1);
    tmp+=z2;
    return 0;
}


