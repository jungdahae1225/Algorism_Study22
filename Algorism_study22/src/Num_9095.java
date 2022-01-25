import java.util.Scanner;

/**
 * ���� n�� �־����� �� 1, 2, 3�� ������ ��Ÿ���� ����� �� ���ϱ�
 * ���� ��� ����. �ߺ� ������� => "�ߺ�"������ Ǯ ����.
 * [0,1,1,3]���� �̱�
 * bucket ũ��� ���� ���� ���� ��������(��� 1�θ� �̷���� ���) �Է� ���� ���� ũ��� ����
 **/

public class Num_9095 {
    public static void pick(int[] dataArr, int[] bucket, int k, int[] sum, int data){ //k�� ���� �Ŵ�
        if(k == 0) { //trivial case
            int total = 0;

            for(int i = 0; i < bucket.length; i++) {
                System.out.print(bucket[i] + " ");
                total += bucket[i];
            }

            System.out.println(total);

//            if(total == data) {
//                sum[0] += 1;
//            }
            return;
        }

        int lastIndex = bucket.length - k -1; //���� �ֱٿ� ���� ���� ����� ��ġ

        for(int i = 0; i < dataArr.length ; i++){
                bucket[lastIndex + 1] = dataArr[i];
                pick(dataArr, bucket, k-1, sum, data);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();

        int[] testArray = new int[testCnt];
        for(int i = 0; i < testArray.length; i++)
            testArray[i] = sc.nextInt();

        int[] dataArr = {0, 1, 2, 3};
        int[] sum = {0};

        for(int i = 0; i < testArray.length; i++) {
            int[] bucket = new int[testArray[0]];
            pick(dataArr, bucket, testArray[0], sum, testArray[0]);
            System.out.println(sum[0]);
            sum[0] = 0;
        }
        sc.close();
    }
}
