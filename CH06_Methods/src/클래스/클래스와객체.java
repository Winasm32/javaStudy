package 클래스;

// 한 자바파일에 여러개의 클래스 생성 가능
class Person {
	String name = "펭수";
	int num;
}

public class 클래스와객체 {

	public static void main(String[] args) {
		// 클래스는 설계도로 실제 사용가능한 객체를 생성함(메모리에 생성)
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.num);
		p1.name = "헹수";
		System.out.println(p1.name);
		// 참조변수
		Person p2;
		Person p3;
		p2 = p1;
		p3 = p2;
		
		System.out.println(p2.name);
		System.out.println(p3.name);
		p3.num = 777;
		System.out.println(p1.num);
		System.out.println(p2.num);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p2 = new Person(); 
		System.out.println(p2.name);
		System.out.println(p2);
	
	}
}
