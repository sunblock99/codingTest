import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        StringTokenizer st =  new StringTokenizer(a," ");

        System.out.println(st.countTokens());
    }
}
