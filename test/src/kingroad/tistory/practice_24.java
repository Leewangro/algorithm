package kingroad.tistory;

public class practice_24 {

	public static void main(String[] args) {
		practice_24 t1 = new practice_24();
	}

	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i < seoul.length; i++){
            if("Kim".equals(seoul[i])){
                answer = "김서방은 " + i + "에 있다";
            } 
        }
        
        return answer;
    }
}
