import java.sql.Array;
import java.util.*;


class Solution {
    public long solution(long n) {
              String answer =  n + "";

        String[] arr = answer.split("");

        Arrays.sort(arr, Comparator.reverseOrder());

        String as = "";
        for(String s : arr){
            as += s;
        }
        return Long.parseLong(as);
    }
}