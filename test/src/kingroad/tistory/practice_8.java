package kingroad.tistory;

public class practice_8 {

	public static void main(String[] args) {

		int[] a =  {1,2,3,4,5,6,7,8,9,10}; 
		System.out.println(solution(a));

	}

	public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        
        answer = sum/arr.length;
        
        return answer;
    }

}
