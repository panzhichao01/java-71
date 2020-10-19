package 课后作业._10月15日;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:
 * 删改查
 *
 * @author Administrator
 * @create 2020-10-15 13:11
 */
public class kai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[]names={"Angelia","Alice","tome","sam","Jack",
                "Ruby","Robin","Anne"};

        //数组删除
        /*System.out.println("请输入需要删除的元素:");
        String temp=input.next();
        int a=-1;
        for (int i = 0; i < names.length; i++) {
            if (temp.equalsIgnoreCase(names[i])){
                a++;
                for (int j = i; j <names.length-1; j++) {

                    names[j]=names[j+1];
                }
                names[names.length-1]=null;
                System.out.println(temp+"已删除!");
            }
        }
        if (a==-1){
            System.out.println("没有找到"+temp+",无法执行删除操作!");
        }
        System.out.println("删除后数组:");
        for (String name : names) {
            System.out.println(name);
        }*/


        //数组修改
       /* System.out.println("请输入需要修改的元素:");
        String temp1=input.next();
        System.out.println("请输入替换的元素:");
        String temp2=input.next();

        int b=-1;
        for (int i = 0; i <names.length ; i++) {
            if (names[i].equalsIgnoreCase(temp1)){
                b=i;
                break;
            }
        }

        if (b==-1){
            System.out.println("未找到元素,无法修改!");
        }else{
            names[b]=temp2;
        }

        System.out.println("修改后的数组:\n"+Arrays.toString(names));*/

        //数组查询
        System.out.println("请输入需要查询的元素:");
        String temp3=input.next();

        int d=-1;
        for (int i = 0; i <names.length; i++) {
            if (names[i].equalsIgnoreCase(temp3)){
                System.out.println("查找到元素"+temp3+",下标为"+i);
            }
        }

        //数组查询

        System.out.println("查询带有a的元素:");
        String[] strFruits = new String[0];
        int m = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].contains("a")){
                strFruits = Arrays.copyOf(strFruits,strFruits.length + 1);
                strFruits[m++] = names[i];
            }
        }
        // System.arraycopy(original, 0, copy, 0,Math.min(original.length, newLength));
        System.out.println("查询水果信息是：" + Arrays.toString(strFruits));









    }

}