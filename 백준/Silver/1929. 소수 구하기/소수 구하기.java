import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] isPrime = new boolean[N + 1];

		for (int i = 2; i <= N; i++) {
    
			isPrime[i] = true;
}

// 에라토스테네스의 체를 사용하여 소수를 찾습니다.
for (int i = 2; i <= Math.sqrt(N); i++) {
    // 소수를 찾으면 그 소수의 배수를 모두 지웁니다 (값을 false로 설정합니다).
    if (isPrime[i]) {
        for (int j = i * 2; j <= N; j += i) {
            isPrime[j] = false;
        }
    }
}

// 결과 출력
for (int i = M; i <= N; i++) {
    if (isPrime[i]) {
        System.out.println(i);
    }
}

}
}