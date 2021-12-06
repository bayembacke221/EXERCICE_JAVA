public class Rectangle {
    private double longueur;
    private double largeur;
    public Rectangle(double L, double l){
        if(l<0){l=l*(-1);}
        this.largeur=l;
        if(L<0){L=L*(-1);}
        this.longueur=L;
    }
    public double getlongueur(){
        return longueur;
    }
    public double getlargeu(){
        return largeur;
    }
    public void setlongueur(double L){
        if(L<0){L=L*(-1);}
        this.longueur=L;
    }
    public void setlargeur(double l){
        if(l<0){l=l*(-1);}
        this.largeur=l;
    }
    public double perimetre(){
        return 2*(this.largeur+this.longueur);
    }
    public double surface(){
        return this.largeur*this.longueur;
    }
    public void affichage(){
        System.out.println(perimetre());
        System.out.println(surface());
    }


}