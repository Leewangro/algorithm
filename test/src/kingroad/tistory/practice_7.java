package kingroad.tistory;

public class practice_7 {

	public static void main(String[] args) {

		System.out.println(solution(6));

	}

	public static int solution(int num) {
        int answer = 0;
        int tmp = num;
        
        for(int i=0; i<500; i++){
        	System.out.println("i >>>" + i);
            if(tmp == 1){
                return i;
            } else if(tmp % 2 == 0){
                tmp = tmp/2;
                System.out.println("test ----------- "+tmp);
            } else if(tmp % 2 ==1) {
            	System.out.println("test2 ----------- "+tmp);
                tmp = tmp*3+1;
            }
        }
        
        if(answer != 1) {
        	answer = -1;
        }
        
        return answer;
    }

}
