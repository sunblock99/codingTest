import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String[] strArray = new String[A];
        for(int i = 0; i < A; i++){
            String str = sc.next();
            strArray[i] = str;
        }

        for(String stt : strArray){
            System.out.print(stt.charAt(0));
            System.out.print(stt.charAt(stt.length()-1));
            System.out.println();
        }

    }
}
