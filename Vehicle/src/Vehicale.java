
public class Vehicale {
	
	public int wheels;
	public int speed;
	private String color; 
	public Vehicale() {
	}
	
	public Vehicale(int wheels , int speed ,String color) {
		this.wheels=wheels;
		this.speed=speed;
		this.color=color;
	}
	
	public void info() {
		System.out.println(this.color);
	
	}
	public String getcolor() {
		return this.color;
	}
	public void setcolor(String color) {
		this.color = color;	
	}
	public void print() {
		System.out.println("peeeep");
	}
}
