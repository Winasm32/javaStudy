package integerVariable;

public class Casting {

	public static void main(String[] args) {
		//�� ��ȯ 
		//�ڵ� �� ��ȯ
		byte a = 32;

		// 1 byte�� ����� ���� 2 byte�� ��ȯ
		short b = a;

		// 2 byte�� ����� ���� 4 byte�� ��ȯ
		int c = b;
		//short z = c;

		// 4 byte�� ����� ���� 8 byte�� ��ȯ
		long d = c;
		//int x = d; �� ūŸ���� ���� Ÿ�Կ� ������ ����.
		
		float e = 1.12F; //�Ǽ��� �⺻ Ÿ���� �����̱� ������ F�� ����
		double f = e;
		
		//����� ��ȯ (���Ҷ�)
		long g = 1000000;
		int h = (int) g;
		
		short i = (short) h;
		System.out.println(i); //����� ��ȯ�� ūŸ�Կ��� ��ȯ�� �ս� ���ɼ�
	}
}
