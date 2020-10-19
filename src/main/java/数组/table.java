package 数组;

/**
 * 描述:
 * 九九乘法表
 *
 * @author Administrator
 * @create 2020-10-14 8:23
 */
public class table {
    public static void main(String[] args) {
       /* for (int i = 1; i <=9; i++) {
            for (int j =1 ; j <=i; j++) {
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }*/




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