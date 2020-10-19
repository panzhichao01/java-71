package 课后作业._10月12日.第二题;

public class max {
    public static void main(String[] args) {
        int[] nums = {8, 7, 3, 9, 5, 4, 1};
        int max=nums[0];
        int min=nums[0];
        int index1=0;
        int index2=0;

        for (int i = 0; i <nums.length ; i++) {
           if (nums[i]>max){
               max=nums[i];
               index1=i;
           }else if(nums[i]<min){
               min=nums[i];
               index2=i;
           }
        }

        System.out.println("数组中最大的值是:"+max+",其下标是:"+index1);
        System.out.println("数组中最小的值是:"+min+",其下标是:"+index2);

    }
}
