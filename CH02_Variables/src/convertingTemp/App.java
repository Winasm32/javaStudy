package convertingTemp;

public class App {

	public static void main(String[] args) {
		// ����(Celsius ���ÿ콺) �� ȭ��(Fahrenheit�۷�����Ʈ) ��ȯ
		// (0 ��C �� 9/5) + 32 = 32 ��F

		double c = 20;
		double f = (c * 9 / 5) + 32;

		System.out.println("���� " + c + "�� ȭ�� " + f + "�̴�.");

	}
}
