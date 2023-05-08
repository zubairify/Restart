
public class HelloDemo {

	public static void main(String[] args) {
		
		Hello h = () -> "Hello World";	// Lambda expression
		
		System.out.println(h.sayHello());
		System.out.println(h.sayBye());
		
		Hello h2 = () -> {
			String msg = "Hola Monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		Hello.greeting();
		
	}
}
