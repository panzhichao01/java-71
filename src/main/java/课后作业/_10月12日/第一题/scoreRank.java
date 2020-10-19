package 课后作业._10月12日.第一题;

import java.util.Scanner;

public class scoreRank {

    public static void main(String[] args) {
        int[] scores=new int[5];
        System.out.println("请输入五名学员的成绩:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            int score = input.nextInt();
            if (score<=100 && score>=0){
                scores[i]=score;
            }else{
                System.out.println("输入成绩有误!");
            }

        }

        for (int i = 0; i <scores.length-1; i++) {

            for (int j = 0; j < scores.length-1-i; j++) {
                if (scores[j]<scores[j+1]){
                    int temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                }
            }
        }

        System.out.print("学员成绩按降序排序:");
        for (int score : scores) {
            System.out.print(score+"\t");
        }




    }
}
