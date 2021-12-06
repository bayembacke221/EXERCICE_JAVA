#include <iostream>
using namespace std;

class constructeur_copie
{
private:
    double longueur, largeur;
    static int compteur;
public:
    constructeur_copie(double, double);
    double Perimetre();
    double aire();
    void affichage();
    constructeur_copie(constructeur_copie const& autre ):longueur(autre.longueur), largeur(autre.largeur){}
};

int constructeur_copie::compteur(0);
constructeur_copie::constructeur_copie(double L, double l)
{
    longueur=L;
    largeur=l;
    compteur++;
}
double constructeur_copie::aire(){
    return longueur*largeur;
}
double constructeur_copie::Perimetre(){
    return 2.0*(longueur+largeur);
}
void constructeur_copie::affichage(){
    cout<<"Aire :"<<aire()<<endl;
    cout<<"Perimetre : "<<Perimetre()<<endl;
    cout<<"compteur"<<compteur<<endl;
}
int main(int argc, char const *argv[])
{
    constructeur_copie R1(12.3, 24.5);
    constructeur_copie R2(R1);
    R1.aire();
    R2.Perimetre();
    R1.affichage();
    R2.affichage();
    return 0;
}
