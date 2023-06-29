import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
        int[] B = new int[9];
        int count = 0;

        for (int i = 0; i < B.length; i++) {
            int C = sc.nextInt();
            B[i] = C;

        }
        int max = -100;
        for(int j = 0; j < B.length; j++){

            if(B[j] > max){
                max = B[j];
                count = j + 1;
            }
        }

        System.out.println(max);
        System.out.print(count);

    }
}
