package 课后作业._10月12日.第三题;


public class randoms {
    public static void main(String[] args) {
        int[] nums=new int[10];
        for (int i = 0; i <nums.length; i++) {
            nums[i]= (int) (Math.random()*10);
        }

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        System.out.print("升序输出:");
        for (int num : nums) {
            System.out.print(num+"\t");
        }

        System.out.println();
        System.out.print("降序输出:");
        for (int i = nums.length-1; i >=0; i--) {
            System.out.print(nums[i]+"\t");
        }


    }
}
