package �ݺ���;

public class ��������ġ {

	public static void main(String[] args) {
		// ������������ ��ġ�� ���� ���� �����ϰ� �Ҵ�(=), �Ҵ�(=)�ϰ� ����
		int cats = 5;
		System.out.println(cats++); //�Ҵ� ���� ���� ����
		System.out.println(cats);
		
		int dogs = 3;
		System.out.println(++dogs); //���� ���� ���� �Ҵ�

		int chickens = 10;	//����� 6, �� 4	
		int animals = cats + chickens++; // ġŲ 10�Ҵ� �� 11		
		System.out.println(animals); //16
		
		int apples = 5;
		int bananas = 4;		
		int fruits = ++apples + bananas++; // ��� 6 �ٳ��� 4 �Ҵ��� 5
		System.out.println(fruits); //10


	}
}
