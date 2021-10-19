package kingroad.tistory;

public class practice_14 {

	public static void main(String[] args) {
		System.out.println(solution(12345));
	}

	public static int solution(int n) {
        int answer = 0;
        String nVal = String.valueOf(n);
        String[] strArr = nVal.split("");
        
        for(int i=0; i < nVal.length(); i++){
            answer += Integer.parseInt(strArr[i]);
        }
        
        // for(int i=0; i < nVal.length(); i++){
        //     answer += Integer.parseInt(nVal.substring(i,i+1));
        // }

        return answer;
    }
}
