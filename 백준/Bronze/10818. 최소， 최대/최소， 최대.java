import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] B = new int[A];


        for (int i = 0; i < B.length; i++) {
            int C = sc.nextInt();
            B[i] = C;

        }
        int min = B[0];
        int max = B[0];
        for(int j = 0; j < B.length; j++){
            if(B[j] < min){
                min = B[j];
            }else if(B[j] > max){
                max = B[j];
            }
        }
        System.out.println(min + " " + max);

    }
}
