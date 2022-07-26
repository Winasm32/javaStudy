package 인터페이스;

public class App {

	public static void main(String[] args) {
		//Object클래스는 모든 클래스의 부모클래스
		Discribable[] objs = { new Person(), new Computer() };
		
		for(Discribable obj: objs) {
			System.out.println(obj.getDescription());
		}

	}

}
