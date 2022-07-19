package application;

public class ForEach반복문 {

	public static void main(String[] args) {
		// for each 반복문
		String[] fruits = { "바나나", "사과", "수박" };
		int[] numbers = { 10, 20, 30 };
		System.out.println(fruits);
		System.out.println(numbers);

		for (String x : fruits) {
			System.out.println(x);
		}
		for (int n : numbers){
			System.out.println(n);
		}

	}

}
