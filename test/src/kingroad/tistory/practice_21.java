package kingroad.tistory;

public class practice_21 {

	public static void main(String[] args) {
		practice_21 t1 = new practice_21();
		System.out.println(t1.solution("pPoooyY"));
	}

	boolean solution(String s) {
        boolean answer = true;
        int cnt_1 = 0;
        int cnt_2 = 0;
        char chVal = ' ';
        
        for(int i=0; i < s.length(); i++){
            chVal =s.charAt(i);
            if(chVal == 'p'|| chVal == 'P'){
                cnt_1++;
            } else if(chVal == 'y' || chVal == 'Y'){
                cnt_2++;
            }
        }
        if(cnt_1 != cnt_2) answer = false;
       
        return answer;
    }
}
