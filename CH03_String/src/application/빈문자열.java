package application;

public class ���ڿ� {

	public static void main(String[] args) {
		// blank vs empty : ������ �����ҷ��� isBlank�� ����Ѵ�.
		String myText = "          \n";
		System.out.println("���ڿ� Ȯ��: " + myText.isEmpty()); //���ڿ��� Ȯ��
		System.out.println("���ڿ� Ȯ��: " +myText.isBlank()); //���鹮�������ϰ� ���ڿ� Ȯ��

		myText = "��ħ���� ���ְ� �Ծ���.";
		System.out.println(myText.replace("��ħ", "����"));
		
		//���� ���� strip()
		String name = "  ���� ";
		System.out.printf("'%s'", name);
		System.out.printf("'%s'", name.strip());
	}

}
