import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int N = Integer.parseInt(br.readLine());

        int i=0;

      while(i < N){
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
         boolean NO = true;
          
        for(int j = 0; j < s.length(); j++){
            char x = s.charAt(j);
            if(x == '(')
               stack.push(x);
            else if (stack.isEmpty()){
                NO = false;
                break;
            }
            else{
                stack.pop();
            }
            
      }
      System.out.println(NO && stack.isEmpty() ? "YES" : "NO");
      i++;
    }
}
}