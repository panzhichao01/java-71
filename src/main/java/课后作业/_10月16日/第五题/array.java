package 课后作业._10月16日.第五题;

import java.util.Scanner;

/**
 * 描述:
 * 数组颠倒
 *
 * @author Administrator
 * @create 2020-10-16 15:06
 */
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的行和列:");
        int n = input.nextInt();
        int k = input.nextInt();

        int[][] nums1 = new int[n][k];
        int[][] nums2 = new int[k][n];

        System.out.println("请输入数组的元素:");
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                nums1[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("依次打印输入的二维数组:");
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                System.out.print(nums1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                nums2[j][i] = nums1[i][j];
            }
        }

        System.out.println("依次输出行列颠倒的二维数组:");
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.print(nums2[i][j] + "\t");
            }
            System.out.println();
        }


    }

}