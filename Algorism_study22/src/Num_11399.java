//ATM�ּ� ��� ����� ���� �����ϴµ� ��� �ð��� �ּ� ���ϱ�
//���..?
/**
 *  3 1 4 3 2
 * [][][][][]
 *
 *
 * �տ������� ���� ���� ���� �������
 *
 * ó�� = �迭 �ӿ��� ���� ���� ��
 * �� ���� �迭 �� ���� ���� ����
 */

import java.util.Arrays;
import java.util.Scanner;

public class Num_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //����� ��

        int[] timeList = new int[num]; // ��� ����ŭ �迭 �����
        for(int i = 0; i < timeList.length; i++)
            timeList[i] = sc.nextInt();

        Arrays.sort(timeList);

        int[] sumArray = new int[timeList.length];

        for(int i = 0; i < timeList.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += timeList[j];
                sumArray[i] = sum;
                /**
                 *  0-0
                 *  0-0 + 0-1
                 *  0-0 + 0-1 + 0-2
                 *  0-0 + 0-1 + 0-2 + 0-3
                 *  0-0 + 0-1 + 0-2 + 0-3 + 0-4
                 *  �̰� ��Ŀ� ���� �� ��.
                 *  [0-0] [0-0 + 0-1] [0-0 + 0-1 + 0-2] [0-0 + 0-1 + 0-2] [0-0 + 0-1 + 0-2 + 0-3] [0-0 + 0-1 + 0-2 + 0-3 + 0-4]
                 */
            }
        }

        int result = 0;
        for(int i = 0; i < sumArray.length;i++)
            result += sumArray[i];

        System.out.println(result);
        
        sc.close();
        return;
    }
}
