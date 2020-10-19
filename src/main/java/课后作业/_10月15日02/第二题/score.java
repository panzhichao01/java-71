package 课后作业._10月15日02.第二题;

import java.util.Scanner;

/**
 * 描述:
 * 学生成绩
 *
 * @author Administrator
 * @create 2020-10-15 18:56
 */
public class score {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] scores =new int[5][3];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第"+(i+1)+"名学生的第"+(j+1)+"门课程的成绩:");
                scores[i][j]=input.nextInt();
            }
        }

        for (int i = 0; i <scores.length; i++) {
            int sum=0;
            int avg=0;
            int max=0;
            int min=scores[i][0];
            for (int j = 0; j <scores[i].length; j++) {
                sum+=scores[i][j];
                if (scores[i][j]>max){
                    max=scores[i][j];
                }else if (scores[i][j]<min){
                    min=scores[i][j];
                }
            }
            avg=sum/scores[i].length;
            System.out.println("第"+(i+1)+"名学生成绩的总分是:"+sum);
            System.out.println("第"+(i+1)+"名学生成绩的平均分是:"+avg);
            System.out.println("第"+(i+1)+"名学生成绩的最高分是:"+max);
            System.out.println("第"+(i+1)+"名学生成绩的最低分是:"+min);
            System.out.println();
        }




    }

}