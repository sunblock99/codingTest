import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        String count = String.valueOf((a1 * a2 * a3));
        for(int i = 0; i  < 10; i++){
            int it = 0;
            for(int j = 0; j < count.length(); j++){
                if(count.charAt(j)-'0' == i){
                    it++;
                }
            }
            System.out.println(it);
        }
    }
}
