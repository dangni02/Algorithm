import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] words = new char[5][15];

        for(int i=0; i < 5; i++){
            String s =  br.readLine();

            for(int j=0; j<s.length(); j++){
                words[i][j]= s.charAt(j);
            }
        }

        for(int j=0; j<15; j++){ // 열 우선 순회
            for(int i=0; i<5; i++){
                if(words[i][j] != '\0') { // null character가 아닐 경우에만 출력
                    System.out.print(words[i][j]);
                }
            }
        }

    }
    
}