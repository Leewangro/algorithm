package kingroad.tistory;

import java.util.Scanner;

public class practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // �Է¹��� �� ����
		int b = sc.nextInt(); // �Է¹��� �� ����

		for (int i = 0; i < b; i++) {
			for( int j = 0 ; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
        }		
		
		// 1) ù ��° �࿡�� �Է¹��� ���� ������ŭ ���� ��� 
		// 2) ���� �� ����� �� ���� �������� �̵�
		// 3) 1,2���� �ݺ�
	}
}
