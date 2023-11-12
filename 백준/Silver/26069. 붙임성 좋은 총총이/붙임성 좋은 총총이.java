import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> user = new HashSet();
        user.add("ChongChong");


        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if(user.contains(s1) || user.contains(s2)){
                user.add(s1);
                user.add(s2);
            }
        }
        System.out.println(user.size());
    }
}