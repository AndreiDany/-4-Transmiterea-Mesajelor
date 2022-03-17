
public class ClientCarte {

	public static void main(String[] args) {
		
		Carte carte1 = new Carte(100);
		Carte carte2 = new Carte(100);
		
		if(carte1.equals(carte2))
			System.out.println("Sunt identice");
		else
			System.out.println("Nu sunt identice");
	}

}
