import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt(br.readLine());

		if (N == 0) {//N이 1일 때
			System.out.println(0);
		} else {
			while (N != 1) {//마지막 몫(1의 반복)에 도달하지 않았을 때
				sb.append(Math.abs(N % -2));//Math.abs = 숫자의 절대값을 반환
				N = (int) Math.ceil((double) N / (-2)); //몫 반올림

			}

			sb.append(N);

			sb.reverse();
			System.out.println(sb);
		}

	}
}