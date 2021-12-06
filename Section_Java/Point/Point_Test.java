public class Point_Test {
    public static void main(String[] args) {
        Point P1=new Point(2,4);
        Point P2=new Point(4,4);
        P1.afficher();
        P2.afficher();
        P1.translater(4,2);
        P1.afficher();
        Point P3=new Point(4,4);
        System.out.println("equal:"+P3.coincide(P1));
        System.out.println("equal:"+P2.coincide(P3));
        System.out.println("--------------------------------------------------------------------");
        Cercle C1=new Cercle(5.0, 2, 4);
        C1.affichage();
        C1.Surface();
        C1.imprimer();

    }
}
