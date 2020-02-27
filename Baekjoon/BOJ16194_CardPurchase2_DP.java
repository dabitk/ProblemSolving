import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	//int[] d = new int[15]; //n 제한은 11이하 이므로 약간 넉넉하게 15로 잡음.
	static int SIZE = 10005;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main a = new Main();
		int[] d = new int[SIZE]; // 카드팩 i개 구매하는 최대 비용을 담는 배열. 메모이제이션용.

		
		//1. 입력을 받은 값으로 카드팩 가격 배열 p를 생성 및 초기화.
		//2. DP 수행. d[i] = p[j]+d[i-j]와 같음.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //구매하려는 카드의 개수
		int[] p = new int[n+1]; //for문은 인덱스 1부터 시작.
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			//입력값으로 카드팩 가격 배열을 초기화
			p[i] = Integer.parseInt(st.nextToken());
			d[i] = 987654321;
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {			
				d[i] = Math.min(d[i], d[i-j]+p[j]);
			}
		}

		System.out.println(d[n]);
		

	}


}