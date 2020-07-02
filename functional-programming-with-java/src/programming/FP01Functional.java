package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListFunctional(numbers);
		printAllEvenNumbersInListFunctional(numbers);

	}
//	
//	private static void print(int number) {
//		System.out.println(number);
//	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);// Method Reference
	}

	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(FP01Functional::isEven)// Filter is only allow even number
				.forEach(System.out::println);// Method Reference

	}

}
