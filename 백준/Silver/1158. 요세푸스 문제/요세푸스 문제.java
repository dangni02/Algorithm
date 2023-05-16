import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//원형 문제이기 때문에 원형 자료구조를 써야겠다 싶었다
// 기억 나는게 원형 큐밖에 없었기 때문에 원형 큐를 써볼까? 하고 구글링 하는 와중에 큐를 쓰는 게 더 쉽다 하여 큐를 썼다


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());//공백 단위로 잘라주는 Stringtoken

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        // linkedlist 이용한 Queue 사용법
        //Queue 자체가 인터페이스이기 때문에 LinkedList 이용하여
        //Queue 선언해야함

        for(int i=0; i < n; i++){//큐에 수 넣어주기
            queue.add(i+1);
        }

        sb.append("<");
       while(queue.size() != 1) {// 마지막 stack 요소를 남겨둘 때까지 ( 마지막에는 , 를 찍지 않아야하기 때문에)
            // K - 1번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());//poll()후 queue 뒤에 추가
            }
            // K번째 값은 poll한 후 sb에 append
            sb.append(queue.poll() + ", ");
        }
        //마지막 애는 queue.poll( 후 ">" sb에 추가
        sb.append(queue.poll() + ">");
        System.out.println(sb.toString() + " ");

    }


}
