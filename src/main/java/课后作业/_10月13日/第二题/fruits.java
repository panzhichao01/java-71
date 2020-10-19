package 课后作业._10月13日.第二题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 字符串排序
 *
 * @author Administrator
 * @create 2020-10-13 18:21
 */
public class fruits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] fru=new String[5];

        for (int i = 0; i <5; i++) {
            System.out.println("请输入第"+(i+1)+"种水果的英文名字:");
            fru[i]=input.next();
        }

        Arrays.sort(fru);

        System.out.println("这些水果的英文名在字典中出现的顺序是:");

        for (int i = 0; i <fru.length; i++) {
            System.out.println(fru[i]);
        }




    }

}