package kingroad.tistory;

public class practice_23 {

	public static void main(String[] args) {
		practice_23 t1 = new practice_23();
		System.out.println(t1.solution("abced"));
	}

	public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
           
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        
        return answer;
    }
}
