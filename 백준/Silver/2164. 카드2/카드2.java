import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        while (queue.size() > 1) {
            queue.poll(); // 맨 앞에 있는 카드를 버림
            queue.offer(queue.poll()); // 그 다음 카드를 큐의 맨 뒤로 보냄
        }
        
        System.out.println(queue.poll()); // 마지막으로 남은 카드를 출력
    }
}