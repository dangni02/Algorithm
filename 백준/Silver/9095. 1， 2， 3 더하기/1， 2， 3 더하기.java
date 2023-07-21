import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        while (T-- > 0) {
            int n = sc.nextInt(); // 주어진 수
            int[] dp = new int[n + 1];

            // 초기값 설정
            dp[0] = 1; // 0은 아무 수도 더하지 않는 경우 1가지 방법이 있습니다.

            // DP 테이블 채우기
            for (int i = 1; i <= n; i++) {
                if (i - 1 >= 0) dp[i] += dp[i - 1];
                if (i - 2 >= 0) dp[i] += dp[i - 2];
                if (i - 3 >= 0) dp[i] += dp[i - 3];
            }

            // 결과 출력
            System.out.println(dp[n]);
        }
    }
}