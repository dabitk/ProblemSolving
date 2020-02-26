import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	int[] d = new int[1005];

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main a = new Main();

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int b = a.go(n);
		System.out.println(b);
	}

	// 1로 만들기 Bottom-up 방식
	public int go(int n) {
		
		for (int i = 0; i <= n; i++) {
			if(i<=2) {
				d[i] = i;
			}else {
				d[i] = (d[i - 1] + d[i - 2]) % 10007;				
			}
			// System.out.println(d[i]);
		}
		return d[n];
	}

}