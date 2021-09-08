package kingroad.tistory;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[] { 44, 1, 0, 0, 31, 25 };
		int[] y = new int[] { 31, 10, 45, 1, 6, 19 };

		solution(x, y);

	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int countLotto = 0;
		int countZero = 0; 
		int totVal = 0;

		// 입력 로또 번호랑 당첨 로또번호 비교
		for (int i : lottos) {
			//System.out.println("i>>>" + i);
			for (int j : win_nums) {
				//System.out.println("j>>>" + j);
				if (i == j)
					countLotto++;
			}
			if (i == 0)
				countZero++;
		}
		
		totVal = countLotto + countZero;
		
		// 최고 순위와 최저 순위를 계산한다.
		//int highRanking = 7 - (countLotto + countZero) > 6 ? 6 : 7 - (countLotto + countZero);
		//int lowRanking = 7 - countLotto > 6 ? 6 : 7 - countLotto;
		int highRanking = 0;
		int lowRanking = 0;
		
		highRanking = getRank(totVal);
		lowRanking = getRank(countLotto);
		
		System.out.println("rank >>> " + highRanking);
		System.out.println("rank >>> " + lowRanking);
		
		int[] answer = { highRanking, lowRanking };

		return answer;
	}
	
	public static int getRank(int cnt) {
		int rank = 0;
		System.out.println(cnt);
		if(cnt == 1 || cnt == 0) {
			rank = 6;
		} else if(cnt == 2) {
			rank = 5;
		} else if (cnt == 3) {
			rank = 4;
		} else if (cnt == 4) {
			rank = 3;
		} else if (cnt == 5) {
			rank = 2;
		} else if (cnt == 6){
			rank = 1;
		}
		
		return rank;
	}

}
