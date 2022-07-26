package 추상클래스;

// 클래스 앞에 abstract 추상클래스
public abstract class GameObject {
	public void hello() {
		System.out.println("헬로우");
	}
	public abstract void describe(); // 추상메서드는 코드블록(몸통)이 없음
}
