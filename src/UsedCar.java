
public class UsedCar extends Car {
	private int miles;
	
	public UsedCar(String make, String model, int year, double price, int miles) {
		super (make, model, year, price);
		this.miles = miles;
	}

	
public int getMiles() {
	return miles;
}
public void setMiles(int miles) {
	this.miles = miles;
}
@Override
public String toString() {
	String out =  super.toString() + "[Miles = " + miles + "]";
	return out;
 }
}
