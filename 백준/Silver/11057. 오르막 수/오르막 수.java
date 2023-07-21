import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//2차원 DP 테이블 생성
		int[][] dp = new int[N+1][10];
		
		//길이가 1인경우 초기화
		for(int i=0;i<10;i++) {
			dp[0][i] = 1;
		}
		
		//DP 테이블 채우기
		for(int i=1; i<= N; i++) {
			for(int j=0; j<= 9; j++) {
				for(int k=j; k < 10; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= 10007;
				}
			}
		}
		
		System.out.println((int)(dp[N][0] % 10007));

	}

}