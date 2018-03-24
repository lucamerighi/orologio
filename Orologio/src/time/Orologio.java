package time;

public class Orologio {
	Counter ore, minuti, secondi;
	
	public Orologio(int ore, int minuti, int secondi) {
		// TODO Auto-generated constructor stub
		this.ore = new Counter(ore);
		this.minuti = new Counter(minuti);
		this.secondi = new Counter(secondi);		
	}
	
	public Orologio(int ore, int minuti) {
		this(ore, minuti, 0);
	}
	
	public Orologio(int ore) {
		this(ore, 0, 0);
	}
	
	public Orologio() {
		// TODO Auto-generated constructor stub
		this(0, 0, 0);
	}

	public int getOre() {
		return ore.getValue();
	}

	public int getMinuti() {
		return minuti.getValue();
	}

	public int getSecondi() {
		return secondi.getValue();
	}
	
	
	
}
