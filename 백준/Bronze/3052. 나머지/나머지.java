import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < 10;i++){
            hs.add(sc.nextInt() % 42);
        }

        System.out.println(hs.size());

    }
}
