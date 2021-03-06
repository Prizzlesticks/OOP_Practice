import java.util.ArrayList;

public class CarDealership {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car ("Ford", "Explorer", 2016, 27999.99));
		carList.add(new Car ("Chevy", "Tahoe", 2016, 31999.99));
		carList.add(new UsedCar("Pontiac", "Aztek", 2003, 2999.99, 235000));
		carList.add(new UsedCar("Saturn", "Vue", 2001, 1999.99, 150000));
		
		carList.get(1).setMake("Fiat");
		carList.get(1).setModel("Spyder");
		carList.get(1).setYear(2017);
		carList.get(1).setPrice(29999.55);
		
		for (Car c: carList) {
			if (c != null){
				
				//System.out.println(c.toString());
				if (c instanceof UsedCar) {
					System.out.println("USED: " + c.getMake() + "\t" + c.getModel() + "\t" + c.getYear() + "\t($" + c.getPrice() + ") " + "Miles: " + ((UsedCar)c).getMiles());
					
				} else {
					System.out.print("NEW: " + c.getMake() + "\t" + c.getModel() + "\t" + c.getYear() + "\t($" + c.getPrice() +")");
					System.out.println();
				}
			}
		}
	}
}

/* for (Car c: carList) {
if (c instanceof UsedCar)
System.out.print("USED: " + "Miles: " + ((UsedCar) c).getMiles() + " ");
else
System.out.print("NEW: ");

System.out.print(c.getMake() + "\t" + c.getModel() + "\t" + c.getYear() + "\t($" + c.getPrice() +")");
System.out.println();
} */