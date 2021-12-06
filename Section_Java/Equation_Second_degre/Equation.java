public class Equation {

    private double R1, R2;
    private double delta; 
    private double a, b,c;
    public Equation(double X1, double X2, double X3){
        this.a=X1;
        this.b=X2;
        this.c=X3;
        delta=this.b*this.b - (4*this.a*this.c);
    }
    public void Affichage_Disriminant(){
        System.out.println(delta);
    }
    public boolean Resoudre(){
        if (delta<0) {
            System.out.println("Pas de solution dans R");
            return false;
        }
        else if (delta>0) {
            R1=(-this.b - Math.sqrt(delta))/(2.0*this.a);
            R2=(-this.b + Math.sqrt(delta))/(2.0*this.a);
        }
        else{
            R1=-b/(2.0*this.a);
        }
        return true;
    }
    public void Affiche_Solution(){
        if (delta>0) {
            System.out.println("Deux solutions distinctes");
            System.out.println("Premiere Solution: "+R1);
            System.out.println("Deuxieme Solution: "+R2);

        }
        else if(delta==0){
            System.out.println("Solution double");
            System.out.println(R1);
        }
        else{
            System.out.println("Pas de solution dans R");
        }
    }
}