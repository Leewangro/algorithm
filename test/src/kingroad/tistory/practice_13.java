package kingroad.tistory;

public class practice_13 {

	public static void main(String[] args) {
		System.out.println(solution(12345));
	}

	public static int[] solution(long n) {
        
        String strVal = String.valueOf(n);
        StringBuilder sb = new StringBuilder(strVal);  
        
        sb.reverse();
        
        String[] strArray = sb.toString().split("");
        int[] answer = new int[sb.length()];
        
        for(int i=0; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(strArray[i]);
        }
        
        return answer;
    }
}
