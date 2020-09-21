package programers.ex;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		// 1. 체육복을 잃어버린 학생의 리스트
		List<Integer> lostList = new ArrayList<>();
		for (int i : lost) {
			lostList.add(i);
		}// for
		//System.out.println("lostList=" + lostList);
		// 2. 체육복 여분을 가지고 있는 학생의 리스트
		List<Integer> reserveList = new ArrayList<>();
		for (int i : reserve) {
			reserveList.add(i);
		}// for turn answer;

		//System.out.println("reserveList=" + reserveList);
		// 3. 체육복을 잃어버렸지만 여분을 가지고 있는 학생은 각 리스트에서 제거한다.
		//    제거하면서 체육복을 빌린 인원을 더해야하기때문에 answer 에 +1 해준다.
		for(int i=0; i<lostList.size(); i++) {
			for(int j=0; j<reserveList.size(); j++) {
				if(lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
					i--;
					answer++;
					break;
				}
			}// for 2
		}// for 1
		// 4. 잃어버린 학생의 앞 뒤 학생이 체육복 여분을 가지고 있으면 빌려줄 수 있다.
		for(int i=0; i<lostList.size(); i++) {
			int lostNum = lostList.get(i);
			for(int j=0; j<reserveList.size(); j++) {
				int reserveNum = reserveList.get(j);
				if(lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
					reserveList.remove(j);
					answer++;
					break;
				}
			}// for 2
		}// for 1
		return answer;
	}// solution 




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		체육복 x = new 체육복();

		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1,3,5};

		x.solution(n, lost, reserve);


	}

}

/*

n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	4
3	[3]	[1]	2

 */