import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);

        String reversed = sb.reverse().toString();

        int result = (s.equals(reversed)) ? 1 : 0;

        System.out.println(result);
    }
}