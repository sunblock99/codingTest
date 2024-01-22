class Solution {
    public String solution(String s) {
                String answer = "";
                 for(int i = 0; i < s.length() - 4; i++){
                     answer += "*";
                 }

                 answer += s.substring(s.length() - 4, s.length());
                     System.out.println(answer);

                return answer;
}
}