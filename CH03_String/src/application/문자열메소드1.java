package application;

public class ���ڿ��޼ҵ�1 {

	public static void main(String[] args) {
		//charAt(�ε�����ȣ) : index��ȣ�� �ش� ���ڰ� ����
		String text = "ABCDE";
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.charAt(4));
		//System.out.println(text.charAt(5));
		
		//���ڿ� ���ĺ��� ��
		String w1 = "abcde";
		String w2 = "abcdd";
		// compareTo �� ���ڿ����� ���ؼ� ū����-���������� ���ڷ� ����
		System.out.println(w1.compareTo(w2));
		
		//contains(���ڿ�) ���ڿ��� �����ϰ� �ִ��� Ȯ��
		text = "���� ������ �����.";
		System.out.println(text.contains("���"));
		
		//concat ���ڿ� ��ħ
		System.out.println(w1.concat(w2));
		// StringBuilder�� ����� ��ħ
		String finalString = new StringBuilder().append(w1).append(w2).toString();
		System.out.println(finalString);
		// String.format("",) : printf("%s",����)��� ������� �ʰ� ���ڿ� ������ ����
		String formatString = String.format("%s %s", w1, w2);
		System.out.println(formatString);
		System.out.printf("%s %s", w1, w2);
	}
}
