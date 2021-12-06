#include <iostream>
#include <string>
using namespace std;

class Compte{
    public:
    int numCompte;
    string nomProprietaire;
    double Solde;
    bool retirerargent(double somme);
    int deposerargent(double somme);
    void consultersolde();
    void transfereragrent(double somme, int numC);
};
int Compte ::deposerargent(double somme){
    Solde+=somme;
    return somme;
}
bool Compte ::retirerargent(double somme){
    if(Solde>somme){
        Solde-=somme;
        return true;
    }
    else
    {
        return false;
    }
    
}
void Compte ::consultersolde(){
    cout<<"Votre solde est egal a:"<<Solde<<endl;
}
void Compte ::transfereragrent(double somme, int numC){
    if(numCompte==numC){
        Solde+=somme;
        cout<<"retrait effectue avec succes!!"<<endl;
    }
    else
    {
        cout<<"transaction echouee !!"<<endl;
    }
}
int main() {
    Compte a;
    a.nomProprietaire="Ben Saleh";
    a.numCompte=6001;
    a.Solde=850175;
    a.consultersolde();
    a.deposerargent(1000);
    a.consultersolde();
    return 0;
}