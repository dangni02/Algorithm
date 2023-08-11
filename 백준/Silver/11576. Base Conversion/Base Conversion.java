import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int m = scanner.nextInt();
        int decimalNum = 0;

        // A진법 수를 10진수로 변환
        for (int i = 0; i < m; i++) {
            decimalNum = decimalNum * A + scanner.nextInt();
        }

        // 10진수를 B진법으로 변환
        StringBuilder convertedNum = new StringBuilder();
        while (decimalNum > 0) {
            int remainder = decimalNum % B;
            convertedNum.insert(0, remainder + " ");
            decimalNum /= B;
        }

        // 결과 출력
        System.out.println(convertedNum.toString().trim());
    }
}