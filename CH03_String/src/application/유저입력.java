package application;

import java.util.Scanner;

public class �����Է� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�µ��� �Է��� �ּ��� : ");
		
		double c = scanner.nextFloat();	
		double f = (c * 9 / 5) + 32;

		//System.out.println("���� " + c + "�� ȭ�� " + f + "�̴�.");
		System.out.printf("���� %.2f �� ȭ�� %.2f�̴�.", c, f);
		
		scanner.close(); //�Է¹޴� ��ĳ�� ��ü�� ����
	}
}
