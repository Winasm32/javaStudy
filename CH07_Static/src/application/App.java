package application;

public class App {

	public static void main(String[] args) {
		// 스태틱(클래스) 상수는 객체생성없이 클래스.상수
		
		System.out.println(Cat.FOOD);
		//System.out.println(Cat.getName());
		//수학공식
		System.out.println(Math.PI);
		
		System.out.println(Cat.getCount());
		
		Cat cat1 = new Cat("마틸다"); //+1
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("라이언"); //+1
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("울버린"); //+1
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(Cat.getCount());
	
//		App app = new App();
//		app.sayHi();
		sayHi();
		hello();
	}

	private static void hello() {
		System.out.println("헬로오!");
		
	}

	private static void sayHi() {
		System.out.println("안녕~!");		
	}

}
