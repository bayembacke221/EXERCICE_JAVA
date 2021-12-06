#include <iostream>
using namespace std;
class Vecteur
{
private:
    int nelem;
    double *adr;
public:
    Vecteur(int);
   // ~Vecteur();
    Vecteur & operator=(Vecteur &);
};

Vecteur::Vecteur (int n) { adr = new double [nelem = n] ;
cout << "+++ constructeur usuel +++ adr objet : " << this
<< " +++ adr vecteur : " << adr << "\n" ; }
Vecteur & Vecteur::operator=(Vecteur & op){
    delete [] adr;
    adr = new double [nelem = op.nelem] ;
    for (int i=0; i<nelem; i++) adr[i] = op.adr[i];
    cout << "+++ c'est une affectation +++ adr objet : " << this
    <<" +++ adr vecteur : " << adr <<endl;
    return *this;
}
int main() {
Vecteur a(5);
Vecteur b(2);
b=a ;
return 0;
}