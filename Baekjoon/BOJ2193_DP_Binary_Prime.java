import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[] cache;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//dp[입력값N][입력값N에서의 끝 자릿수] = 계단수 개수
		int n = Integer.parseInt(br.readLine());
		long[][] dp = new long[n+5][2];// 행을 자릭수, 열은 0과 1만 가질 수 있음
		long result = 0;
		
		dp[1][0] = 0; dp[1][1] = 1;
		dp[2][0] = 1; dp[2][1] = 0;
		
		for(int i=2;i<=n;i++){
			for(int j=0;j<=1;j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][0]+dp[i-1][1];
				}else { // j가 1일때
					dp[i][j] = dp[i-1][0];
				}
			}
		}
		
		//결과 조립
		for(int i=0;i<=1;i++) {
			result += dp[n][i];
		}
		System.out.println(result);


		br.close();
	}
	
}
