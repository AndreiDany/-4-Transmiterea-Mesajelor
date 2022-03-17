
public class Carte {
	
	private int numarPagini;

	public Carte(int numarPagini) {
		this.numarPagini = numarPagini;
	}
	
	public boolean equals(Carte carte)
	{
		if(this.numarPagini==carte.numarPagini)
			return true;
		else
			return false;
	}
	
}
