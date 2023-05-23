import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[9];
        
        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
        }
        
        findSevenDwarfs(heights);
        
        scanner.close();
    }
    
    public static void findSevenDwarfs(int[] heights) {
        Arrays.sort(heights); // 키를 오름차순으로 정렬
        
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    // 일곱 난쟁이를 찾았을 때 출력하고 메소드 종료
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(heights[k]);
                    }
                    return;
                }
            }
        }
    }
}