#include <iostream>
using namespace std;

 class rectangle{
     private:
     float largeur, longueur;
     public:
     void setlongueur(float);
     void setlargeur(float);
     float getlongueur();
     float getlargeur();
     rectangle(float, float);
     void affichage();
     float surface();
     float perimetre();
 };
 rectangle::rectangle(float l, float L){
     if(L<0){ L=L*(-1);} 
     longueur=L;
     if(l<0){ l=l*(-1);}
     largeur=l;
 }
 void rectangle::setlargeur(float l){
     if(l<0){ l=l*(-1);}
     largeur=l;
 }
 void rectangle::setlongueur(float L){
     if(L<0){ L=L*(-1);} 
     longueur=L;
 }
 float rectangle::getlargeur(){
     return largeur;
 }
 float rectangle::getlongueur(){
     return longueur;
 }
 float rectangle::perimetre(){
     return 2*(longueur+largeur);
 }
float rectangle::surface(){
    return longueur  *largeur;
}
void rectangle::affichage(){
    cout<<"La longueur du rectangle est:"<<getlongueur()<<endl;
    cout<<"La largeur du rectangle est :"<<getlargeur()<<endl;
    cout<<"La surface est :"<<surface()<<endl;
    cout<<"Le perimetre est :"<<perimetre()<<endl;
}

 int main(int argc, const char** argv) {
     rectangle R(5.0, 15.0);
     R.affichage();
     R.setlargeur(12);
     R.setlongueur(24);
     R.affichage();
     R.surface();
     R.perimetre();
    return 0;
}