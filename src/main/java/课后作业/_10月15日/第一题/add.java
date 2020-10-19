package 课后作业._10月15日.第一题;

import java.util.Scanner;

/**
 * 描述:
 * 数组增加
 *
 * @author Administrator
 * @create 2020-10-15 11:09
 */
public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Angelia", "Alice", "tome",
                "sam", "Jack", "Ruby", null, "Robin", "Anne"};
        System.out.println("请输入需要增加的姓名:");
        String name = input.next();

        for (int i = 0; i < names.length; i++) {
            int k=0;
            if (names[i]==null) {
                k++;
            }
            if (k==1){
                names[i]=name;
                break;
            }
        }

        for (String s : names) {
            System.out.println(s);
        }

    }

}