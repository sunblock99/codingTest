class Solution {
    public int solution(int numbers) {

        if(numbers % 7 == 0){
            return numbers / 7;
        }else {
            return numbers / 7 + 1;
        }
    }


}