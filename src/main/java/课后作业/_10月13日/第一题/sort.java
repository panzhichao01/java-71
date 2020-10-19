package 课后作业._10月13日.第一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 字符排序
 *
 * @author Administrator
 * @create 2020-10-13 17:57
 */
public class sort {
    public static void main(String[] args) {
        char[] chars = {'a','c','u','b','e','p','f','z'};

        Arrays.sort(chars,0,8);
        System.out.println(Arrays.toString(chars));

        System.out.println("请输入需要查找的特殊字符:");
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);

        for (int i = 0; i <chars.length; i++) {
            if (ch==chars[i]){
                System.out.println("特殊字符"+ch+"的下标是:"+i);
            }
        }



    }

}