package level1;

public class MissingNumberSum {
	 public int solution(int[] numbers) {
	        int answer = 45;
	        for (int n : numbers) {
	            answer -= n;
	        }

	        return answer;
	    }
}
