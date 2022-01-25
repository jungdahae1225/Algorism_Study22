import java.util.Scanner;

/**
 * 정수 n이 주어졌을 때 1, 2, 3의 합으로 나타내는 경우의 수 구하기
 * 순서 상관 있음. 중복 상관없음 => "중복"순열로 풀 거임.
 * [0,1,1,3]에서 뽑기
 * bucket 크기는 가장 많을 때를 기준으로(모두 1로만 이루어진 경우) 입력 받은 값의 크기와 같게
 **/

public class Num_9095 {
    public static void pick(int[] dataArr, int[] bucket, int k, int[] sum, int data){ //k개 뽑을 거다
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

        int lastIndex = bucket.length - k -1; //가장 최근에 뽑힌 수가 저장된 위치

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
