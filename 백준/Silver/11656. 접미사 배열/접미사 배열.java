import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] suffixes = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            suffixes[i] = input.substring(i);
        }

        Arrays.sort(suffixes);

        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}