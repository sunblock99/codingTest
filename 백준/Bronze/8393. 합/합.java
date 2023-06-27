import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= A; i++){
            count += i;
        }

        System.out.println(count);
    }

}
