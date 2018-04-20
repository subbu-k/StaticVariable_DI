package beans;

public class Car {
	private static String carname;
	private static int modelyear;
	
	public static void setModelyear(int modelyear) {
		Car.modelyear = modelyear;
	}

	public static void setCarname(String carname) {
		Car.carname = carname;
	}

	public static void hello() {
		System.out.println("Car Name:"+carname+"\t ModelYear:"+modelyear);
	}

}
