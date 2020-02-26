import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	//int[] d = new int[15]; //n ������ 11���� �̹Ƿ� �ణ �˳��ϰ� 15�� ����.
	static int MOD = 1000000009;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main a = new Main();
		long[] d = new long[1000005]; //�����÷ο� ������ ���� int ��� long���� �迭 ����
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
		
		//�Է� ���� �ޱ� ���� ��� N ������ ���� �޸������̼��� ������.

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