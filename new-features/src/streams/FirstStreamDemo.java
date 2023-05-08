package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Integer[] ar = {2, 5, 7, 6, 9, 3, 2, 4};
		List<Integer> numbers = Arrays.asList(ar);
		
//		for (Integer n : numbers) 
//			System.out.println(n);
		
//		numbers.forEach(System.out::println);
//		numbers.forEach(FirstStreamDemo::print);
		
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);	// forEach is a terminal operation
		
//		numbers.stream().distinct().forEach(System.out::println);	// distinct is intermediate operation
		
//		System.out.println(numbers.stream().distinct().count());	// count is terminal operation
		
//		System.out.println(numbers.stream().filter(n -> n > 5).count());	// filter is intermediate operation
		
//		numbers.stream().distinct().sorted().forEach(System.out::println);	// sorted is intermediate
		
//		System.out.println(numbers.stream().reduce(0, (n, m) -> n + m));	// reduce is terminal operation
//		System.out.println(numbers.stream().reduce(0, Integer::sum));
//		System.out.println(numbers.stream().reduce(0, FirstStreamDemo::add));
//		
//		numbers.stream().limit(5).forEach(System.out::println);	// limit is intermediate
		
		IntStream istr = IntStream.range(1, 99);
//		System.out.println(istr.count());
//		System.out.println(istr.sum());
//		System.out.println(istr.skip(50).sum());
		
//		IntStream istr2 = IntStream.of(5, 7, 6, 9, 3, 2, 4);
//		System.out.println(istr2.count());
//		System.out.println(istr2.sum());
		
		IntSummaryStatistics statics = istr.summaryStatistics();
		System.out.println(statics);
	}
}
