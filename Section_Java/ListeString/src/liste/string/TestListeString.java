package liste.string;

public class TestListeString {
	public static void main(String [] args) {
		String[] stb1=new String[]{"la mer est bleue"};
		String st="bleue";
		System.out.println(ListeString.existeDans(st,stb1));
	}
}
