package ���ǹ�;

import java.util.Scanner;

public class ���� {

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
		
		if (option == 1) {
			System.out.println("��ο�");
		} else if (option == 2) {
			System.out.println("�ȳ� ?");
		} else if (option == 3) {
			System.out.println("�����մϴ�...");
		} else if (option == 10000) {
			System.out.println("�̽�Ʈ���׸� �߰��߽��ϴ�.");
		} else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}
	}
}
