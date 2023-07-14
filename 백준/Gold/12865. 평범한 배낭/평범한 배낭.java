import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int dp[][], W[], V[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());//물품 수
		int K = Integer.parseInt(st.nextToken());//총 무게

		dp = new int[N+1][K+1];
		W = new int[N+1];
		V = new int[N+1];

		for(int i=1;i<=N;i++){
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());//무게
			V[i] = Integer.parseInt(st.nextToken());//가치
		}

		for(int i=1;i<=N;i++){
			for(int j=1; j <= K; j++){
				dp[i][j] = dp[i-1][j];//기본적으로 이전 아이템의 가치를 저장
				if(j - W[i] >= 0){
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]]+V[i]);
				}

			}

		}
		System.out.println(dp[N][K]);
	}

}