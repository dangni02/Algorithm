import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int Fibonacci(int n){

        if(n == 0)
        return 0;
        if(n == 1)
        return 1;

        return Fibonacci(n - 1) + Fibonacci(n-2);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(Fibonacci(N));
    }
    
}
