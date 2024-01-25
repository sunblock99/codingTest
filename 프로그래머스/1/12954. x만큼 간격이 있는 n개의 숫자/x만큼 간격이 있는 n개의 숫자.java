class Solution {
    public long[] solution(int x, int n) {
      long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            if(i == 0){
                answer[i] = x;
                continue;
            }
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}