package integerVariable;

public class VariableAssignment {

	public static void main(String[] args) {
		// ������ ���� ���Ҵ� �Ҽ� �ִ�.
		int dog = 8;
		int cat = 3;
		
		System.out.println("1. dog : " + dog);
		System.out.println("1. cat : " + cat);
		
		dog = cat;
		cat = 10;
		
		System.out.println("2. dog : " + dog);
		System.out.println("2. cat : " + cat);		

	}

}
