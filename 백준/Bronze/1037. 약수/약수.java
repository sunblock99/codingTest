import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int divCount = sc.nextInt();
            int divMax = Integer.MIN_VALUE;
            int divMin = Integer.MAX_VALUE;

            while (divCount-- > 0) {
                int tmp =  sc.nextInt();

                divMax = tmp > divMax? tmp : divMax;
                divMin = tmp < divMin ? tmp : divMin;
            }

            System.out.println(divMax * divMin);
    }
}