package time;

public class Counter {
	private int value;
	
	public Counter(int startValue) {
		// TODO Auto-generated constructor stub
		this.value = startValue;
	}
	
	public Counter() {
		// TODO Auto-generated constructor stub
		this.value = 0;
	}
	
	public void reset() {
		this.value = 0;
	}
	
	public void inc() {
		this.value++;
	}
	
	public int getValue() {
		return value;
	}
	
	
}
