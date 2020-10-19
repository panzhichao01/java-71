package 数组;

/**
 * 描述:
 * 杨辉等腰三角形
 *
 * @author Administrator
 * @create 2020-10-16 10:45
 */
public class Test11 {
    public static void main(String[] args) {
        int [][] arr=new int[10][10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i][0]=1;  //控制第一列的数等于1
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];  //赋值
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-i; j >0; j--) {  //空格的控制
                System.out.print("  ");
            }
            for (int k = 0; k < arr.length; k++) {  //打印出数组的数字
                if (arr[i][k] !=0){   //把没赋值的零清除掉
                    System.out.print(arr[i][k]+"    ");
                }
            }
            System.out.println();
        }
    }

}