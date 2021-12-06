#include <iostream>
using namespace std;
class Abonnee
{
private:
    char nom[30];
    char prenom[30];
    int numero;
    int CNI;
    double solde;
public:
    void saisir();
    void afficher();
    double recharger(double);
    bool consommer(int , double);
};
void Abonnee::saisir(){
    cout<<"Donner le nom de l'abonne: ";
    cin>>nom;
    cout<<"Donner le prenom de l'abonne: ";
    cin>>prenom;
    cout<<"Donner le numero de telephone de l'abonne";
    cin>>numero;
    cout<<"Donner son solde:";
    cin>>solde;
    cout<<"Donner le CNI de l'abonne:";
    cin>>CNI;
}
void Abonnee::afficher(){
    cout << "Le nom :"<<nom<< endl ;
    cout << "Le prénom :" <<prenom<< endl ;
    cout<<"Telephone: "<<numero<<endl;
    cout<<"CNI: "<<CNI<<endl;
} 
double Abonnee::recharger(double som){
    return solde+=som;
}
bool Abonnee::consommer(int nombre_seconde=12, double prix= 0.036){
    double prix_par_sec;
    prix_par_sec=nombre_seconde*prix;
    if (recharger(solde)>prix_par_sec)
    {
        solde-=prix_par_sec;
        return true;
    }
    else{
        return false;
    }
    
}
int main(int argc, char const *argv[])
{
    Abonnee A;
    A.saisir();
    A.afficher();
    A.recharger(50000);
    A.afficher();
    return 0;
}
