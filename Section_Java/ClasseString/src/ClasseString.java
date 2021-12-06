import java.util.Scanner;
public class ClasseString {

	public static void main(String[] args) {
//		Scanner clavier= new Scanner(System.in);
//		System.out.println("Donner une chaine de caractere");
//		String ch=clavier.nextLine();
//		System.out.println(" "+ch);
//		System.out.println(" "+ch.toUpperCase());
		String text = "Welcome to WayToLearnX";  
        int count = 0;
        //Compter chaque caractére sauf l'espace
        for(int i = 0; i < text.length(); i++) {  
            if(text.charAt(i) != ' ')  
                count++;  
        }  
        System.out.println("Nombre total de caractères est: " + count);  

	}

}
