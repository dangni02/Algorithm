import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int sim;
		
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine(), " " );
		for(int i=0; i< N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
		System.out.println(result);
			
	}
	
	static int search(int[] arr, int N, int M) {
		int result=0;
		
		for(int i=0; i < N-2; i++) {//첫번째 for문은 N-2까지 순회
			for(int j=i+1; j < N-1; j++) {
				for(int k=j+1;k<N;k++) {
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) {
						return temp;
					}
					
					if(result < temp && temp < M) {//세 카드의 합이 이전합보다 크고
						result = temp;//M보다 작을 경우 result 갱신
					}		
				}		
			}
			
		}		
		return result;		
	}

}