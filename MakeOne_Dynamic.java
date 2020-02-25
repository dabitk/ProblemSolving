
public class Algorithm {
	int[] d = new int[100];
	public Algorithm() {}
	
	//1로 만들기 Top-down 방식
//	public int go(int n) {
//		if(n == 1) return 0;
//		if(d[n] > 0) return d[n];
//		d[n] = go(n-1)+1;
//		if(n%2==0) {
//			int temp = go(n/2) + 1;
//			if(d[n] > temp) d[n] = temp;
//		}
//		if(n%3 == 0) {
//			int temp = go(n/3)+1;
//			if(d[n] > temp)d[n] = temp;
//		}
//		return d[n];
//	}
	
	//1로 만들기 Bottom-up 방식
	public int go(int n) {
		d[1] = 0;
		for(int i=2;i<=n;i++) {
			d[i] = d[i-1] + 1;
			if(i%2 == 0 && d[i] > d[i/2] + 1) {
				d[i] = d[i/2]+1;
			}
			if(i%3==0&&d[i] >d[i/3]+1) {
				d[i] = d[i/3]+1;
			}
		}
		return d[n];
	}
	public static void main(String[] args) {
		Algorithm a = new Algorithm();
		int b = a.go(10);
		System.out.println(b);
	}
}
