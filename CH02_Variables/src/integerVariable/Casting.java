package integerVariable;

public class Casting {

	public static void main(String[] args) {
		//형 변환 
		//자동 형 변환
		byte a = 32;

		// 1 byte로 저장된 값을 2 byte로 변환
		short b = a;

		// 2 byte로 저장된 값을 4 byte로 변환
		int c = b;
		//short z = c;

		// 4 byte로 저장된 값을 8 byte로 변환
		long d = c;
		//int x = d; 더 큰타입을 작은 타입에 넣을순 없다.
		
		float e = 1.12F; //실수의 기본 타입은 더블이기 때문에 F를 붙임
		double f = e;
		
		//명시적 변환 (원할때)
		long g = 1000000;
		int h = (int) g;
		
		short i = (short) h;
		System.out.println(i); //명시적 변환시 큰타입에서 변환시 손실 가능성
	}
}
