package kingroad.tistory;

public class practice_5 {

	public static void main(String[] args) {

		String test = "01033334444";
		//String test2 = "027778888";
		
		System.out.println(solution(test));
		//solution(test2);

	}

	 public static String solution(String phone_number) {
	        String answer = "";
	        
	        for(int i=0; i < phone_number.length() ; i++) {
	        	if(i < phone_number.length()-4) {
	        		answer += "*";
	        	} else {
	        		answer += phone_number.charAt(i);
	        	}
	        }
	        
	        return answer;
	    }
	 
	/* public static String solution2(String phone_number) {
	        String answer = "";
	        
	        
	        for(int i = 0; i < phone_number.length()-4; i++) {
	    		answer.setCharAt(i, '*');
	    	}
	        
	        return answer;
	    }
	 */
}
