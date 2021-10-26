package kingroad.tistory;

import java.util.Arrays;
import java.util.Collections;

public class practice_19 {

	public static void main(String[] args) {
		practice_19 t1 = new practice_19();
		System.out.println(t1.solution("teAstTAZ"));
	}

	public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        Collections.reverse(Arrays.asList(strArr));
        answer = String.join("", strArr);
        return answer;
    }
}
