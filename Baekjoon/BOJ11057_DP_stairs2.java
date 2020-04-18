import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[] cache;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//dp[입력값N][입력값N에서의 끝 자릿수] = 계단수 개수
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][10];
		int mod = 10007, result = 0;
		
		for(int i=0;i<=9;i++) {
			dp[1][i] = 1;
		}
		
		//dp표 작성
		for(int i=2;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=j;k<=9;k++) {
					dp[i][j] = (dp[i][j]+dp[i-1][k]);
				}
				dp[i][j]%=mod;
				//dp[i][j]%=mod;
			}
		}
		
		for(int i=0;i<=9;i++) {
			result+=dp[n][i];
			result%=mod;
		}
		System.out.println(result);


		br.close();
	}
	
}
