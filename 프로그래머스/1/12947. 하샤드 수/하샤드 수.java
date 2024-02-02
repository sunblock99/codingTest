class Solution {
    public boolean solution(int x) {
            int a = 0;
        String[] str =  String.valueOf(x).split("");

        for(int i = 0; i < str.length; i++){
            a += Integer.parseInt(str[i]);
        }

        return x % a == 0 ? true : false;
    }
}