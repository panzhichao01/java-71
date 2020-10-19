package 数组;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int [] list={99,85,82,63,60};
        int[] lists=new int[6];
        lists[0]=99;
        lists[1]=85;
        lists[2]=82;
        lists[3]=63;
        lists[4]=60;

        Scanner input=new Scanner(System.in);
        System.out.println("请输入您要插入的学生成绩:");
        int num =input.nextInt();
        int index=lists.length-1;
        for (int i = 0; i <lists.length ; i++) {
            if(num>lists[i]){
                index=i;
                break;
            }
        }

        for (int i =lists.length-1; i>index; i--) {
            lists[i]=lists[i-1];
        }
        lists[index]=num;
        for (int i : lists) {
            System.out.print(i+"\t");
        }


    }
}
