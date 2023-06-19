import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        
        for(int i = 0; i < S.length(); i++){
        	Character s = S.charAt(i);
            if(s == '<') {
            	while(!stack.empty()) {
            		System.out.print(stack.pop());
            	}
            	flag = true;
            	System.out.print(s);

            }
            else if(s == '>') {
            	flag = false;
            	System.out.print(s);

            }
            else if(flag) {
            	System.out.print(s);
            	
            }
            else {
            	if(s == ' ') {
            		while(!stack.empty()) {
                		System.out.print(stack.pop());
                	}
            		System.out.print(s);
            	}
            	else {
            		stack.push(s);
            	}
            	   	
            }
          
        }
        while(!stack.empty()) {
    		System.out.print(stack.pop());
    	}

        }
    }
