package kingroad.tistory;

import java.util.Arrays;

public class practice_4 {

	public static void main(String[] args) {

		int x[][] = new int[5][10];
		int y[][] = new int[3][5];

		solution(x, y);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		System.out.println(arr1.length);     // 배열의 사이즈
		System.out.println(arr1[0].length);  // 배열의 첫 번째 행의 원소의 갯수 출력
		/*
		 * [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
		 *  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
		 *  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 
		 *  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0], 
		 *  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]  와 같은 구조로 이루어져 있음
		 * 
		 * */
		System.out.println(Arrays.deepToString(answer));
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}
}
