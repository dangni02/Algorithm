import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            list.add(n);
        }

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);

    }
    
}