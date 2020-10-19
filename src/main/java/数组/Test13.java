package 数组;

import java.util.Scanner;

/**
 * 描述:
 * 杨辉三角形(直角)
 *
 * @author Administrator
 * @create 2020-10-18 23:38
 */
public class Test13 {
    public static void main(String[] args) {
        System.out.println("输出");
        Scanner input =new Scanner(System.in);
        int m =input.nextInt();
        int [][] nums=new int[m][m];

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <i; j++) {
                if (j==0 || j==i){
                    nums[i][j]=1;
                }else {
                    nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
                }
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

}