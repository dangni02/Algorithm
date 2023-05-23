import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for(int n : numbers){
            if(isPrime(n)){
                sum++;
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i < n; i++){
            if(n % i == 0) return false;
        }

        return true;

    }
    
}
