import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int AA = sc.nextInt();
        int[] B = new int[A];


        for (int i = 0; i < B.length; i++) {
            int C = sc.nextInt();
            B[i] = C;
            if(B[i] < AA){
                System.out.print(B[i] + " ");
            }

        }
    }
}
