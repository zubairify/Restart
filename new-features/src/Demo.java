
public class Demo<Z> {
	private Z data;

	public Demo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<Integer> d1 = new Demo<Integer>(100);
//		d1.setData("Hola");
		System.out.println(d1.getData());
		
		Demo<String> d2 = new Demo<String>("Hello");
//		d2.setData(3.14);
		System.out.println(d2.getData());
	}
}
