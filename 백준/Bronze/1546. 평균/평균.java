import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;
        int max = 0;
        for(int i = 0; i  < a; i++){
            int b = sc.nextInt();
            count += b;
            if(max < b || max == 0){
                max = b;
            }
        }

        System.out.println(count * 100.0/max/a);
    }
}
