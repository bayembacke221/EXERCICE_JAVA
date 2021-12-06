import java.util.Scanner;
/**
 * Somme_Harmonique
 */
public class Somme_Harmonique {

    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        int n, i=1;
        float somme=0;
        System.out.println("Donner un entier positif");
        n=clavier.nextInt();
       if (n<0) {
            System.out.println("Vous devez donner un entier strictement positif");
            n=clavier.nextInt();
        }
        while(i<=n ){
            somme+= (float)1/i;
            i++;
        }
        System.out.println("La somme Harmonique"+somme);
    }
}
