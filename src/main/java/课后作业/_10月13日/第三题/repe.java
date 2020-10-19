package 课后作业._10月13日.第三题;

import java.util.Arrays;

/**
 * 描述:
 * 数组去重
 *
 * @author Administrator
 * @create 2020-10-13 18:52
 */
public class repe {
    public static void main(String[] args) {
        int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        int[] arr22=new int[arr11.length];
        int k=0;

        for (int i = 0; i <arr11.length; i++) {
            boolean judge=false;
            for (int j = 0; j <arr11.length; j++) {
                if (arr11[i]==arr22[j]){
                    judge=true;
                    break;
                }
            }
            if (!judge){
                arr22[k++]=arr11[i];
            }
        }

        int[] arr33=new int[k];

        /*for (int i = 0; i <arr33.length; i++) {
            arr33[i]=arr22[i];
        }*/
        arr33= Arrays.copyOf(arr22,k);
        System.out.println("去除重复后:\n"+Arrays.toString(arr33));



    }

}