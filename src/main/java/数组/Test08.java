package 数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 二维数组
 *
 * @author Administrator
 * @create 2020-10-15 17:14
 */
public class Test08 {

    public static void main(String[] args) {
        int [][] scores=new int [3][3];
        Scanner input=new Scanner(System.in);


        for (int i = 0; i < scores.length; i++) {
            System.out.println("第"+(i+1)+"个班");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
                scores[i][j]=input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(scores));


        System.out.println("统计考试成绩:");
        for (int i = 0; i < scores.length; i++) {
            int sum=0;
            for (int j = 0; j < scores[i].length; j++) {
                sum+=scores[i][j];
            }
        }
    }
}