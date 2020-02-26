import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	//int[] d = new int[15]; //n 제한은 11이하 이므로 약간 넉넉하게 15로 잡음.
	static int MOD = 1000000009;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main a = new Main();
		long[] d = new long[1000005]; //오버플로우 방지를 위해 int 대신 long으로 배열 선언
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//d[0]=0;
		d[1]=1;
		d[2]=2;// 1+1, 2
		d[3]=4 ;//1+1+1,2+1,1+2,3
		for (int i = 4; i <= 1000000; i++) {

			d[i] = ((d[i - 1]) + (d[i - 2]) + (d[i-3]))%MOD;				

			// System.out.println(d[i]);
				
		}
		
		//입력 값을 받기 전에 모든 N 범위에 대해 메모이제이션을 끝내둠.

		int T = Integer.parseInt(br.readLine());
		int[] ans = new int[T];
		int cnt = 0;
		while(cnt < T) {
			int n = Integer.parseInt(br.readLine());
			//ans[cnt] = a.go(n);
			ans[cnt] = (int)d[n];
			cnt++;
		}
		for(int b: ans) {
			System.out.println(b);
		}
		

	}


}