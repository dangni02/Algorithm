import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] result = new int[4];
        int[] frequent = new int[8001];
        int fre = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            frequent[arr[i] + 4000]++;
            fre = Math.max(fre, frequent[arr[i] + 4000]);
        }

        result[0] = (int) Math.round((double) sum / N);
        Arrays.sort(arr);
        result[1] = arr[N / 2];

        boolean secondMode = false;
        for (int i = 0; i < frequent.length; i++) {
            if (frequent[i] == fre) {
                if (!secondMode) {
                    result[2] = i - 4000;
                    secondMode = true;
                } else {
                    result[2] = i - 4000;
                    break;
                }
            }
        }

        result[3] = arr[N - 1] - arr[0];

        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}