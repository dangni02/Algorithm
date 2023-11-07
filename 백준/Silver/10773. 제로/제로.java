import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = sc.nextInt();
        for(int i = 0; i < K; i++) {
            int number = sc.nextInt();
            if(number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        int sum = 0;
        for(int num : stack) {
            sum += num;
        }

        System.out.println(sum);
    }
}