package application;

public class ���ڿ��޼ҵ�2 {

	public static void main(String[] args) {
		//substring(�����ε�����ȣ)
		String text = "apple";
		String newText = text.substring(1);
		System.out.println(newText);
		newText = text.substring(1,3);
		System.out.println(newText);
		
		//indexOf(����) ���ڿ��� Ư�� ������ �ε��� ��ȣ ����
		String myText = "abcdefgh";
		System.out.println(myText.indexOf('c'));
	}
}
