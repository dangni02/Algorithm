import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] points = new int[N][2];

        for(int i=0; i<N; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[1] == point2[1]) {
                    return point1[0] - point2[0];  // y좌표가 같다면 x좌표 비교
                } else {
                    return point1[1] - point2[1];  // y좌표 비교
                }
            }
        });

        for(int i=0; i<N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }

    }
}