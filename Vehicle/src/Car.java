
public class Car extends Vehicale	{
   public int price;
   public int id;
	public Car () {
		super();
	}
	public Car (int price, int id) {
		this.price=price;
		this.id=id;
	}
	
	public Boolean electricLock () {
		return true;
	}
}
