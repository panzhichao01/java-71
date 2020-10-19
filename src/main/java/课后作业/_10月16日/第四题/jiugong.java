package 课后作业._10月16日.第四题;

import java.util.Scanner;

/**
 * 描述:
 * 九宫格
 *
 * @author Administrator
 * @create 2020-10-16 15:00
 */
public class jiugong {
    public static void main(String[] args) {
        //定义数组长度 n ,即 n*n 宫格
        int length;

        System.out.print("请输入九宫格的行数(只能是奇数哦):");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        scanner.close();

        // 定义数组
        int[][] arr= new int[length][length];
        // 初始化起始位置
        int i = 0;
        int j = length/2 ;
        arr[i][j] = 1;
        // 确定2~n*n个数字
        for(int n = 2;n<=length*length;n++) {
            //先向上走一步
            i = (i-1+length)%length;
            //向右走一步
            j = (j+1+length)%length;
            //判断此位置有没有被占用
            if(arr[i][j] ==0) {
                arr[i][j] = n;      //没有被占用
            }else {               // 被占用
                //先向下走一步
                i = (i+1+length)%length;
                //先向下走一步
                i = (i+1+length)%length;
                //向左走一步
                j = (j-1+length)%length;
                arr[i][j] = n;
            }
        }

        // 打印九宫格
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }

}
