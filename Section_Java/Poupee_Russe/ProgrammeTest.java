public class ProgrammeTest {
    public static void main(String[] args) {
        Poupee_Russe P1=  new Poupee_Russe(35);
        Poupee_Russe P2= new Poupee_Russe(15);
        Poupee_Russe P3= new Poupee_Russe(50);
        P1.fermer();
        P2.Placerdans(P1);
        P3.ouvrir();
        P1.sortirDe(P3);
    }
}
