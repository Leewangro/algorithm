package kingroad.tistory;

public class practice_22 {

	public static void main(String[] args) {
		practice_22 t1 = new practice_22();
		System.out.println(t1.solution(3,5));
	}

	public long solution(int a, int b) {
        long answer = 0;
        
        if(a<b){
            for(int i=a; i <= b; i++){
                answer += i;
            }
        } else if(a>b){
            for(int i=b; i <= a; i++){
                answer += i;
            }
        } else if(a==b){
            answer = a;
        }

        return answer;
    }
}
