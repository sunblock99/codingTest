import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }


    }
}
