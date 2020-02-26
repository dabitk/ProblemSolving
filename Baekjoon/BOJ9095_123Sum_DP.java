import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	//int[] d = new int[15]; //n 제한은 11이하 이므로 약간 넉넉하게 15로 잡음.

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main a = new Main();

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] ans = new int[T];
		int cnt = 0;
		while(cnt < T) {
			int n = Integer.parseInt(br.readLine());
			ans[cnt] = a.go(n);
			cnt++;
		}
		for(int b: ans) {
			System.out.println(b);
		}
		

	}

	// Bottom-up 방식
	public int go(int n) {
		int[] d = new int[15];
		
		//d[0]=0;
		d[1]=1;
		d[2]=2;// 1+1, 2
		d[3]=4 ;//1+1+1,2+1,1+2,3
		for (int i = 4; i <= n; i++) {

			d[i] = (d[i - 1] + d[i - 2] + d[i-3]);				

			// System.out.println(d[i]);
		}
		return d[n];
	}

}