package application;

public class 참조변수 {

	public static void main(String[] args) {
		// String은 기본 자료형이 아닌 참조 자료형, 
		// 참조 변수는 기본적으로 주소값을 갖는다.
		String text = null; // 참조변수의 주소값이 없음
		text = "헬로우!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println(texts);
		System.out.println(texts[0]);		
		System.out.println();
		
		texts[0] = new String("하이!");
		texts[1] = "안 녕?";
		texts[2] = "굿 바이!";

		for(String w : texts) {
			System.out.println(w);
		}

	}

}
