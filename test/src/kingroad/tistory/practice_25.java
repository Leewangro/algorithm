package kingroad.tistory;

public class practice_25 {

	public static void main(String[] args) {
		practice_25 t1 = new practice_25();
	}

	public int[] solution(int []arr) {
        int[] tmpArr = new int[arr.length];
        int idx = 0;
        
        for (int i = 0; i < arr.length -1; i++){
           
            if(arr[i] != arr[i+1]){
                tmpArr[idx] = arr[i];
                idx++;
            }
            
            if((i+1) == (arr.length)){
                tmpArr[idx++] = arr[arr.length-1];
            }
        }

        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++) {
            answer[i] = tmpArr[i];
        }
        return answer;
    }
}
