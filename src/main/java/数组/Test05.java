package 数组;

import java.util.Arrays;

/**
 * 描述:
 * 合并数组
 *
 * @author Administrator
 * @create 2020-10-14 9:40
 */
public class Test05 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));





    }

}