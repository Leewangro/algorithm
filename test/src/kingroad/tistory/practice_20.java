package kingroad.tistory;

import java.util.Arrays;
import java.util.Collections;

public class practice_20 {

	public static void main(String[] args) {
		practice_20 t1 = new practice_20();
		System.out.println(t1.solution("5123"));
	}

	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i=0; i < s.length(); i++) {
                if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                    // ���ڿ� ���ڸ� �񱳽ÿ��� �ƽ�Ű�ڵ�� ��
                    answer = false;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }
}
