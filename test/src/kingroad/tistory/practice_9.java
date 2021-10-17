package kingroad.tistory;

import java.util.Arrays;

public class practice_9 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(6, 24)));

	}

	public static int[] solution(int n, int m) {
		// 최소공배수 : (a*b) / (최대공약수)
		// 최대공약수 : (a % b)를 활용하여 더 이상 나머지가 나오지 않을때 까지 반복한다.
		int big = (n > m) ? n : m;
		int small = (n < m) ? n : m;
		int[] answer = new int[2];

		answer[0] = gcd(big, small);
		answer[1] = big * small / answer[0];

		return answer;
	}

	public static int gcd(int a, int b) {
		System.out.println("a >>> "+a);
		System.out.println("b >>> "+b);
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}

}
