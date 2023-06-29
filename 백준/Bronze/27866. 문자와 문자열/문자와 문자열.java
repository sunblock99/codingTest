import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = sc.nextInt();

        System.out.println(str.charAt(a-1));

    }
}
