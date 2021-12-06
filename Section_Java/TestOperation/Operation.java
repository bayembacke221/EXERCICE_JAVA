import java.util.Scanner;
public class Operation{
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int n, m;
        int k;
        System.out.println("Donner un nombre");
        n = clavier.nextInt();
        System.out.println("Donner un nombre");
        m = clavier.nextInt();
        k = add(n, m);
        System.out.println("La somme est:"+k);

    }
}