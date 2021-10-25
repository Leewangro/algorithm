package kingroad.tistory;

public class practice_18 {

	public static void main(String[] args) {
		practice_18 t1 = new practice_18();
		System.out.println(t1.solution(15));
	}

	public String solution(int n) {
        String answer = "";

		for (int i = 0; i < n; i++) {
			if(i%2 == 0) {
				answer += "¼ö";
			}
			
			if(i%2 == 1) {
				answer += "¹Ú";
			}
		}
        
        return answer;
    }
}
