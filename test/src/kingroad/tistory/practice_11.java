package kingroad.tistory;

import java.util.Arrays;

public class practice_11 {

	public static void main(String[] args) {
		int[] arr = {6,5,4,3};
		System.out.println(Arrays.toString(solution(arr)));

	}

	 public static int[] solution(int[] arr) {        
	        if(arr.length <= 1){
	            int[] answer = {-1};
	            return answer;
	        }
	        int min = arr[0];
	        for (int i=0; i < arr.length; i++){
	            min = Math.min(arr[i],min);
	        }

	        int[] answer = new int[arr.length-1];
	        int idx=0;
	        
	        for(int i=0; i < arr.length; i++){
	            if(arr[i] == min){
	                continue;
	            }
	            answer[idx+i] = arr[i];
	        }
	        
	        return answer;
	    }
}
