package kingroad.tistory;

import java.util.Scanner;

public class practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 입력받은 열 갯수
		int b = sc.nextInt(); // 입력받은 행 갯수

		for (int i = 0; i < b; i++) {
			for( int j = 0 ; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
        }		
		
		// 1) 첫 번째 행에서 입력받은 열의 갯수만큼 별을 출력 
		// 2) 별을 다 출력한 후 다음 라인으로 이동
		// 3) 1,2번의 반복
	}
}
