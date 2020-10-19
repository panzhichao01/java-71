package 课后作业._10月15日02.第三题;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2020-10-15 23:09
 */
public class money {
    public static void main(String[] args) {
        double[][] moneys={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

        for (int i = 0; i < moneys.length; i++) {
            double sum=0;
            for (int j = 0; j < moneys[i].length; j++) {
                sum+=moneys[i][j];
            }
            System.out.println("第"+(i+1)+"季度销售额:"+sum+"(万元)");
        }
    }
}


















