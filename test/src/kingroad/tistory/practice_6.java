package kingroad.tistory;

public class practice_6 {

	public static void main(String[] args) {

		System.out.println(solution(12));

	}

	public static boolean solution(int x) {
		boolean answer = true;
		int n = x;
		int sum = 0;

		
		if(n > 0) {
			sum = sum + (n % 10);
			n = n/10;
		}
		
		System.out.println(sum);
		System.out.println(n);
		
		answer =  x % sum == 0 ? true : false;
		
		return answer;
	}

}
