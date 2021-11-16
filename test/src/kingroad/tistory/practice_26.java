package kingroad.tistory;

import java.util.ArrayList;
import java.util.Arrays;

public class practice_26 {

	public static void main(String[] args) {
		practice_26 t1 = new practice_26();
	}

	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();     
        
        for(int arrVal : arr){
            if(arrVal % divisor == 0){
                intArr.add(arrVal);
            }
        }
        
        if(intArr.size() == 0) {
            return new int[]{-1};
        }
        
        int[] answer = new int[intArr.size()];
        for(int i=0;i < intArr.size(); i++){
            answer[i] = intArr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
