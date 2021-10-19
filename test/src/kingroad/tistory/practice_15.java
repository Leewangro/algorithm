package kingroad.tistory;

public class practice_15 {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

	public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        
        int idx = 0;
        
        for(int i=0; i < strArr.length; i++){
            if(strArr[i].equals(" ")){
                idx = 0;
                continue;
            } else if(idx % 2 == 0){
                strArr[i] = strArr[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0){
                strArr[i] = strArr[i].toLowerCase();
                idx++;
            }
            
            answer += strArr[i];
        }
        
        return answer;
    }
}
