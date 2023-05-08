
public class Car {
	private String model;
	private String[] features;
	
	public Car() {
	}

	public Car(String model, String...features) {	// var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Specs of " + model);
		for (String f : features) 
			System.out.println(f);
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "Power Window");
		
		Car mini = new Car("Mini Cooper", "ABS", "Traction Control", "Keyless", "Airbags", "Climate Control", "Cruise");
		
		alto.specs();
		mini.specs();
		
	}
}
