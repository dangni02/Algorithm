import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//원형 문제이기 때문에 원형 자료구조를 써야겠다 싶었다
// 기억 나는게 원형 큐밖에 없었기 때문에 일단 원형 큐
//원형 큐는 선형 큐와 마찬가지로 선입선출(First In First Out) 형태의 데이터 구조입니다. 
//front와 rear 역시 사용하며 배열로 구현할 수 있습니다. 원형 큐는 선형 큐의 한계점을 해결하기 위해 구조화한 것인데,
// 배열의 마지막 인덱스에서 다음 인덱스로 넘어갈 때 '(index+1) % 배열의 사이즈'를 이용하여 
//인덱스 0으로 순환되는 구조 OutOfBoundsException이 일어나지 않고 

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
       while(queue.size() != 1) {
            // K - 1번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 값은 poll한 후 출력한다.
            sb.append(queue.poll() + ", ");
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb.toString() + " ");

    }


}