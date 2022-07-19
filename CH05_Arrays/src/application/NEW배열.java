package application;

import java.util.Scanner;

public class NEW배열 {

	public static void main(String[] args) {
		// new 키워드로 배열 생성
		//int[] numbers = {}; 초기값을 바로 넣는 방법
		final int NUM = 3; // 배열의 크기

		int[] numbers = new int[NUM];
		
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < NUM; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}

		scanner.close();

		int total = 0; // 숫자의 합을 계산할 변수
		for (int i = 0; i < NUM; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i]; // 배열의 아이템 하나하나의 값을 더함
		}

		System.out.println("합계 : " + total);

	}

}
