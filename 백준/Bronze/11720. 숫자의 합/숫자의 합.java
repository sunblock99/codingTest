import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;
        String b = sc.next();

        for(int i = 0; i  < a; i++){
            count += b.charAt(i) - '0';

        }
        System.out.println(count);
    }
}
