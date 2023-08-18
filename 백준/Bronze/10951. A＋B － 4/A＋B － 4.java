import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(b > 0 || c < 10){
                int d = b + c;
                System.out.println(d);

            }else{
                break;
            }

        }
    }
}
