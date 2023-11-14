import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] array = new int[N];
            for (int j = 0; j < N; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }
            
            long gcd_sum = 0;
            for (int j = 0; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    gcd_sum += gcd(array[j], array[k]);
                }
            }
            System.out.println(gcd_sum);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
 