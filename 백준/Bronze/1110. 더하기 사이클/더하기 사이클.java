import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int temp = n;
		int count = 0;
		
		while(true) {
			int left = temp / 10;
			int right = temp % 10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if(n == temp) {
				break;
			}
		}
		
		System.out.println(count);
	}
}