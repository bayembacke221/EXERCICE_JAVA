class Poupee_Russe{
    int taille;
    boolean ouverte;
    Poupee_Russe dans, contient;
    Poupee_Russe(int taille){
        this.taille=taille;
        this.ouverte=false;
    }
    void ouvrir(){
        if(!this.ouverte && this.dans==null){
            this.ouverte=true;
        }
    }
    void fermer(){
        if(this.ouverte && this.dans==null){
            this.ouverte=false;
        }
    }
    void Placerdans(Poupee_Russe P){
        if(!this.ouverte && this.dans==null && P.ouverte && P.taille>this.taille){
            this.dans=P;
            P.contient=this;
        }
    }
    void sortirDe(Poupee_Russe P){
        if (P.ouverte && P.contient==this) {
            this.dans=null;
            P.contient=null;
        }
    }
}