package 数组;

import java.util.Scanner;

/**
 * 描述:
 * 杨辉三角形
 *
 * @author Administrator
 * @create 2020-10-16 10:00
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您要的杨辉三角形的行数");
        int n=input.nextByte();
        int[][] arr=new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=1;
            arr[i][i]=1;
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                arr[i][j] =arr[i-1][j-1]+arr[i-1][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("   ");
        }



       /* System.out.println("请输入您要的杨辉三角形的行数");
        int m=input.nextByte();
        int[][] arr2=new int[m][m];

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < i; j++) {
                if (j==0 || j==i){
                    arr2[i][j]=1;
                }else{
                    arr2[i][j]=arr2[i-1][j-1]+arr2[i-1][j];
                }
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }*/



        input.close();

    }


}