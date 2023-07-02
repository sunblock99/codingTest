
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str;
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++) {
			str = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()))+ "\n");
		}
		bw.close();
	}
}
