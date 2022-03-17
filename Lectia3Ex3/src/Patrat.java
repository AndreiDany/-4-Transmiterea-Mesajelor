
public class Patrat {
	private int l;

	public Patrat() {
		this.l = 10;
	}

	public Patrat(int l) {
		
		this.l = l;
	}

	@Override
	public String toString() {
		return "Patrat " + l + " " + (l*l);
	}
	
	
}
