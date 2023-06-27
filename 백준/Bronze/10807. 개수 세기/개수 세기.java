import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int[] B = new int[A];


        int count = 0;
        for(int i = 0; i < B.length; i++){
            int C = sc.nextInt();
            B[i] = C;
        }
        int D = sc.nextInt();

        for(int j = 0; j < B.length; j++) {
            if(B[j] == D){
                count++;
            };
        }

        System.out.println(count);
        }
}
