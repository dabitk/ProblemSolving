
public class Algorithm {
	int[] arr = new int[100];
	public Algorithm() {}
	
	//bottom-up방식의 Dynamic Programming
//	public int getFibo(int n) {
//
//			arr[0]=0;
//			arr[1]=1;
//			for(int i=2;i<=n;i++) {
//				arr[i] = arr[i-1] + arr[i-2];
//				//System.out.println(arr[i]);
//			}
//			return arr[n];
//				
//	}
	
	//top-down방식의 Dynamic Programming
	public int getFibo(int n) {
		if(n<=1) {
			return n;
		} else {
			arr[n] = getFibo(n-1) + getFibo(n-2);
			return arr[n];
		}
	}
	public static void main(String[] args) {
		Algorithm a = new Algorithm();
		int b = a.getFibo(7);
		System.out.println(b);
	}
}
