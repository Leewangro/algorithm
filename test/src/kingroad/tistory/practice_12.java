package kingroad.tistory;

import java.util.Arrays;
import java.util.Collections;

public class practice_12 {

	public static void main(String[] args) {
		System.out.println(solution(873211));
		//System.out.println(solution2(873211));
	}

	public static long solution(long n) {
        String strVal = String.valueOf(n);
        char[] sortArr = new char[strVal.length()];
        String sortStr = "";

        for(int i=0; i < strVal.length(); i++){
            sortArr[i] += strVal.charAt(i);
        }
        
        Arrays.sort(sortArr);
        
        for(int i=0; i < sortArr.length; i++) {
        	sortStr += Character.toString(sortArr[i]);
        }
        
        StringBuffer sb = new StringBuffer(sortStr);
        
        return Long.parseLong(sb.reverse().toString());
        
    }
	
	public static long solution2(long n) {
		String longVal = String.valueOf(n);
	
		String[] strArray = longVal.split("");
		Arrays.sort(strArray);
		Collections.reverse(Arrays.asList(strArray));

		return Long.parseLong(String.join("", strArray));

	}
}
