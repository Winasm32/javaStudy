package ���ǹ�;

import java.util.Scanner;

public class If�� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ : ");
		int apples = scanner.nextInt();
		System.out.print("�ٳ��� ������ : ");
		int bananas = scanner.nextInt();
		scanner.close();
				
//		if(apples > bananas) {
//			System.out.println("����� �ٳ������� ����");
//		}
//		if(apples < bananas) {
//			System.out.println("�ٳ����� ������� ����");
//		}
//		if(apples > bananas) {
//			System.out.println("����� �ٳ������� ����");
//		} else {
//			System.out.println("�ٳ����� ������� ����");
//		}
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		} else if(apples < bananas){
			System.out.println("�ٳ����� ������� ����");
		} else {
			System.out.println("�ٳ����� ����� ������ ����");
		}
		
		System.out.println("���α׷� ����.");	


	}

}
