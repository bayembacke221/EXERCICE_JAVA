package graph.2D;
import testpackage.Point;
public class Circle {
    private double r;
    private Point p;
    private final double PI=3.14;
    public Circle(double r, int x, int y){
        this.r=r;
        p=new Point(x,y);
    }
    public Circle(){
        
    }
    public double Surface(){
        return this.PI*this.r*this.r;
    }
    public void affichage(){
        System.out.println("Le cercle de rayon :"+r);
        System.out.println("De centre:");
        p.afficher();
    }
    public void imprimer(){
        System.out.println("La surface du cercle est:"+Surface());

    }
}
