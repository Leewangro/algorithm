package kingroad.tistory;

import java.util.ArrayList;
import java.util.Arrays;

public class practice_27 {

	public static void main(String[] args) {
		practice_27 t1 = new practice_27();
	}

	public long solution(long n) {
	      Double sqrt = Math.sqrt(n);
	      
	      if(sqrt == sqrt.intValue()){
	          
	          return (long)Math.pow(sqrt + 1, 2);
	        } else {
	          return -1;
	        }
	    }
}
