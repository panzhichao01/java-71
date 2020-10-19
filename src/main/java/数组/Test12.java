package 数组;

import java.util.Scanner;

/**
 * 描述:
 * 杨辉等腰三角
 *
 * @author Administrator
 * @create 2020-10-19 0:05
 */
public class Test12 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("请输入杨辉三角的行数：");
        int n = sc.nextInt();
*/
        int[][] arrays = new int[10][];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[i + 1];
            //左边打印空格，打印等腰三角形
            for(int k = 0; k<= arrays.length-i; k++ ){
                System.out.print("  ");
            }
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == 0 || j == 0 || i == j) {
                    arrays[i][j] = 1;
                } else {
                    arrays[i][j] = arrays[i - 1][j] + arrays[i - 1][j - 1];
                }
                System.out.print(arrays[i][j] + "   ");
            }
            System.out.println();
        }


        int [][] arr=new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];

            for (int k = 0; k <=arr.length-i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j < arr[i].length; j++) {
                if (i==0 || j==0 || j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }


    }

}