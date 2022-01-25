import java.util.Scanner;

/**
 * @author dahae
 * ���̳��� ���α׷��� => ���� �������� ������ ����� ����
 * n = 1 1   1��
 * n = 2 1+1 2��
 * n = 3 1+1+1 1+2 3��
 * n = 4 1+1+1+1 1+1+2 1+2+1 2+1+1 2+2 1+3 3+1 7��
 * n = 5 13��
 * 
 * ã�� ��Ģ  dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
 */
public class Num_9095 {
   
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        int[] dpArr = new int[11];
        int[] resultArr = new int[testCnt];
        
        dpArr[0] = 0;
        dpArr[1] = 1;
        dpArr[2] = 2;
        dpArr[3] = 4;
        
        for(int i = 4; i < dpArr.length; i++)
        	dpArr[i] = dpArr[i-3] + dpArr[i-2] + dpArr[i-1];
        
        for(int i = 0; i < testCnt; i++)
        	resultArr[i] = sc.nextInt();

        for(int i = 0; i < testCnt; i++)
        	System.out.println(dpArr[resultArr[i]]);

        sc.close();
    }
}
