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
        int count=0;

        for(int i=0;i<N;i++){
            String s = (br.readLine());
            
            if(s.equals("ENTER")){
                count += user.size();
                user.clear();
                continue;
            }
            user.add(s);
        }   

        count += user.size();
        System.out.println(count);
    }  
}