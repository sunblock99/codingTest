import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int B = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= B; i++){
            int C = sc.nextInt();
            int D = sc.nextInt();

            count += C * D;

        }

        if(A == count){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
