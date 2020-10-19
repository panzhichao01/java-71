package 数组;

import java.util.Scanner;

/**
 * 描述:
 * 数组插入
 *
 * @author Administrator
 * @create 2020-10-14 10:03
 */
public class Test06 {
    public static void main(String[] args) {
        String [] names={"Tome","jack","Sam","Alice",null,"Ruby","Robin"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入人员姓名:");
        String name=input.next();
        int j=-1;
        for (int i = 0; i < names.length; i++) {
            if (names[i]==null){
                j=i;
                break;
            }
        }
        System.out.println("j="+j);
        if (j!=-1){
            names[j]=name;
        }else{
            System.out.println("数组已满,无法添加元素");
        }
        System.out.println("增加后的人员姓名:");
        for (String s : names) {
            System.out.println(s+"\t");
        }
    }

}