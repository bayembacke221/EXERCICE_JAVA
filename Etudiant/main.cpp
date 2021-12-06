#include <iostream>
#include <stdlib.h>
using namespace std;

class Etudiant{
   
{ private:

            char nom[50], prenom[50];

            float tabnotes[10] ;

  public :

            void saisie () ;

            void affichage () ;

            float moyenne() ;

            int admis() ;

            int exae_quo (Etudiant E) ;

} ;

void Etudiant ::saisie ()

{ int i ;

            cout << "Donner le nom :" ;

            cin >> nom ;

            cout << "Donner le prénom :" ;

            cin >> prenom ;

            cout << "Saisie des notes \n" ;

            for (i = 0 ; i < 10 ; i++)

            {

                        cout << "Donner la note N°" << i<< " : " ;

                        cin >> tabnotes[i] ;

            }

}

void Etudiant ::affichage ()

{ int i ;

            cout << "Le nom :"<<nom<< endl ;

            cout << "Le prénom :" <<prenom<< endl ;

            for (i = 0 ; i < 10 ; i++)

                        cout << "La note N°" << i << "est " << tabnotes[i]<< endl ;

}

float Etudiant ::moyenne()

{ int i ;

  float som = 0;

            for (i = 0 ; i < 10 ; i++)

                        som + = tabnotes[i] ;

            return (som/10)

}

int Etudiant ::admis()

{ if (moyenne() >= 10) return (1); else return (0);}

int Etudiant ::Exae_quo(Etudiant E)

{ if (moyenne() == E.moyenne()) return (1); else return (0);}    
int main(){
    Etudiant E1("Mbaye", "Amsatou");
    E1.saisienote();
    E1.moyenne();
    E1.affichage();
    Etudiant E2("Mbaye", "Fadel");
    E2.saisienote();
    E2.moyenne();
    E2.affichage();
    for (int i = 0; i < 10; i++)
    {
        if (E1.exae_quo(E2)==1)
        {
            cout<<"ils sont exae_quo"<<endl;
        }
        else
        {
            cout<<"ils ne le sont pas"<<endl;
        }
        
        
    }
    
}