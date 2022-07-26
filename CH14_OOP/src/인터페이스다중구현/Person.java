package 인터페이스다중구현;

//상속은 하나의 클래스만 가능 반면에 인터페이스구현은 여러개 가능
public class Person implements Speaker, Greeter{

	@Override
	public void greet() {
		System.out.println("환영합니다.");
	}

	@Override
	public void speak() {
		System.out.println("나는 사람입니다.");
	}

}
