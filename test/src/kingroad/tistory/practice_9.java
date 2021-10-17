package kingroad.tistory;

import java.util.Arrays;

public class practice_9 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(6, 24)));

	}

	public static int[] solution(int n, int m) {
		// �ּҰ���� : (a*b) / (�ִ�����)
		// �ִ����� : (a % b)�� Ȱ���Ͽ� �� �̻� �������� ������ ������ ���� �ݺ��Ѵ�.
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
