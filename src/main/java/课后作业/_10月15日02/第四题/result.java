package 课后作业._10月15日02.第四题;

import java.util.Arrays;

/**
 * 描述:
 * 成绩
 *
 * @author Administrator
 * @create 2020-10-15 23:15
 */
public class result {
    public static void main(String[] args) {
        int[][] scores=new int[3][5];
        int[] sums=new int[scores.length];
        for (int i = 0; i <scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j]=(int) (Math.random() * 100);
            }
        }

        System.out.println("\t"+"Java\tJSP\t CoreJava\tMySQL\tHTML5");
        for (int i = 0; i <scores.length; i++) {
            int sum=0;
            int avg=0;
            System.out.print((i+1)+":\t");
            for (int j = 0; j <scores[i].length; j++) {
                System.out.print(scores[i][j]+"\t\t");
                sum+=scores[i][j];
            }
            sums[i]=sum;
            avg=sum/scores[i].length;

            System.out.println();
            System.out.println("\t总分是:"+sum+",平均分是:"+avg);
        }

    }

}