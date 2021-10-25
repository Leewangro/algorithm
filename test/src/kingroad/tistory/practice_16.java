package kingroad.tistory;
public class practice_16 {

	public static void main(String[] args) {
		practice_16 t1 = new practice_16();
		System.out.println(t1.solution("-1234"));
	}

	public int solution(String s) {
		int answer = 0;
        String strVal = "";
        
        if(s.charAt(0) == '-'){
            strVal = s.substring(1);
            answer = Integer.parseInt(strVal)*-1;
            
        } else {
            answer = Integer.parseInt(s);
        }
       
        return Integer.parseInt(s);
    }
}

