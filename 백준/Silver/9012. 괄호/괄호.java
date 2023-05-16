import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {// BufferedReader 쓸 때 throws IOException 필수
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체 생성
      
        int N = Integer.parseInt(br.readLine());//한 줄 읽어오기

        int i=0;

      while(i < N){ // 입력받을 명령어 수만큼 반복
        String s = br.readLine();//한 줄 읽어오기
        Stack<Character> stack = new Stack<>(); // char 형 스택 선언 ( 라이브러리 활용 )
         boolean NO = true;// ) 가 먼저 올 때 오류라는걸 알리기 위해
          
        for(int j = 0; j < s.length(); j++){
            char x = s.charAt(j); // s 하나하나 잘라서 char x에 할당
            if(x == '(')
               stack.push(x); // stack에 push
            else if (stack.isEmpty()){ // stack이 비었다면 = ')'가 '('보다 먼저 왔다면
                NO = false;//boolean형을 false로 만들어주고
                break;
            }
            else{
                stack.pop();//')'가 오면 pop
            }
       
      }
      System.out.println(NO && stack.isEmpty() ? "YES" : "NO"); // 람다식 활용
      i++;
    }
}
}
