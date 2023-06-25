import java.util.*;

class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A;
    A = sc.nextInt();


    if (A >= 90 && A <= 100) {
        System.out.print("A");
    } else if (A >= 80 && A <= 89) {
        System.out.print("B");
    } else if (A >= 70 && A <= 79) {
        System.out.print("C");
    } else if (A >= 60 && A <= 69) {
        System.out.print("D");
    } else {
        System.out.print("F");
    }
     
}
}