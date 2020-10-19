package 课后作业._10月13日.第三题;

import java.util.Arrays;

/**
 * 描述:
 * 去重
 *
 * @author Administrator
 * @create 2020-10-14 9:01
 */
public class test {

    public static void main(String[] args) {
        int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3,0};
        int[] arr22 = new int[arr11.length];
        boolean of=false;
        int k=0;
        int s=0;

        for (int i = 0; i <arr11.length; i++) {
            boolean is=false;
            for (int j = 0; j <arr11.length; j++) {
                if (arr11[i]==arr22[j]){
                    is=true;
                    if (arr11[i]==0 && !of){
                        of=true;
                        is=false;
                    }
                    break;
                }
            }
            if(!is){
                arr22[k++]=arr11[i];
            }
        }

        int [] arr33=new int[k];
        System.arraycopy(arr22,0,arr33,0,arr33.length);
        System.out.println(Arrays.toString(arr33));



    }
}