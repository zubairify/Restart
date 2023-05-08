import static com.ibm.cc.Currency.*;
import static java.lang.System.out;

public class CurrencyDemo {

	public static void main(String[] args) {
		
		out.printf("%.2f\n", convert(USD, INR, 10));
		
		out.printf("%.2f\n", convert(UKP, USD, 10));
		
		out.printf("%.2f\n", convert(UKP, INR, 10));
	}
}
