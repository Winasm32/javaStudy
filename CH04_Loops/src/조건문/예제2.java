package ���ǹ�;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		System.out.println("�޴�");
		System.out.println("====\n");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ���α׷� ����\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ɼ��� ���� > ");
		int option = scanner.nextInt();
		scanner.close();
		
		switch(option) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ� ?");
			break;
		case 3:
			System.out.println("�����մϴ� ...");
			break;
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
			break;
		}
	}
}
