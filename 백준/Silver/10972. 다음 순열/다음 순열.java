import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] permutation = new int[N];

        for (int i = 0; i < N; i++) {
            permutation[i] = sc.nextInt();
        }

        if (nextPermutation(permutation)) {
            for (int i = 0; i < N; i++) {
                System.out.print(permutation[i] + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    static boolean nextPermutation(int[] array) {
        // 1. 뒤에서부터 보아 처음으로 감소하는 부분을 찾는다. (i-1)
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) return false; // 마지막 순열인 경우

        // 2. i-1 위치값과 교환할 더 큰 값을 찾는다.
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        // 3. i-1 위치값과 j 위치값을 교환한다.
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // 4. i 위치부터 끝까지를 오름차순 정렬한다.
        // (실제로는 뒤집기만 하면 됨, 이미 최대값에서 내림차순이었기 때문)
        int k = array.length - 1;
        while (i < k) {
            temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            i++;
            k--;
        }

        return true;
    }
}