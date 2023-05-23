import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Deque{//Deque 클래스
	public int[] data;
	public int front;
	public int back;
	public int size;

	public Deque(){
		data = new int[10000];
		front = 0;
		back = 0;
		size = 0;
	}

	public void pushFront(int x){
		data[front] = x;
		front = (front - 1 + 10000) % 10000;
		size++;
	}

	public void pushBack(int x){
		back = (back + 1) % 10000;
		size++;
		data[back] = x; 
	}

	public int popFront(){
		if(size == 0){
			return -1;
		}
		
		int a = data[(front + 1) % 10000];
		front = (front + 1) % 10000;
		size--;
		return a;
	}

	public int popBack(){
		if(size == 0){
			return -1;
		}
		int a = data[back];
		back = (back - 1 + 10000) % 10000;
		size--;
		return a;
	}

	public int size(){
		return size;
	}

	public int isEmpty(){
		return size() == 0 ? 1 : 0;
	}

	public int getFront(){
		if (size == 0){
			return -1;
		}
		return data[(front + 1) % 10000];
	}

	public int getBack(){
		if (size == 0){
			return -1;
		}
		return data[back];
	}
}

public class Main{
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	
	Deque deque = new Deque();

	for(int i=0; i < N; i++){
		StringTokenizer st = new StringTokenizer(br.readLine());
		String data = st.nextToken();

		switch(data){
			case "push_front":{
				int x = Integer.parseInt(st.nextToken());
				deque.pushFront(x);
				break;
			}
			case "push_back":{
				int x = Integer.parseInt(st.nextToken());
                deque.pushBack(x);
				break;
			}
			case "pop_front":{
				System.out.println(deque.popFront());
				break;
			}
			case "pop_back":{
				System.out.println(deque.popBack());
				break;
			}
			case "size":{
				System.out.println(deque.size());
				break;
			}
			case "empty":{
				System.out.println(deque.isEmpty());
				break;
			}
			case "front":{
				System.out.println(deque.getFront());
				break;
			}
			case "back":{
				System.out.println(deque.getBack());
				break;
			}
			

		}


	}

	}
	
}
