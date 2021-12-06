package testpackage;

public class Point {
    private  int x;
    private  int y;
    private short couleur;

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    } 

    public Point(int a, int b, short c) {
        this.couleur = c;
        this.x = a;
        this.y = b;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void translater(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void afficher() {
        System.out.println("L'abcisse est :" + x);
        System.out.println("L'ordonnee est :" + y);
    }

    public boolean coincide(Point P) {
        Point t=null;
        if ((P.x == this.x) && (P.y == this.y)) {
            t=this;
            t=null;
            return true;
        }
        else{
            return false;
        }
    }

}
