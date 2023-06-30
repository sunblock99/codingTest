import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B == 0)
                break;

            if(B % A == 0){
                System.out.println("factor");

            }else if(A % B == 0){
                System.out.println("multiple");

            }
            else{
                System.out.println("neither");

            }
        }
    }
}
