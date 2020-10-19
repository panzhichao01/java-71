package 数组;

public class Test02 {
    public static void main(String[] args) {
        int[] nums ={18,28,8,98,76,1};
        System.out.print("前:");
        for (int num : nums) {
            System.out.print(num+"\t");
        }
        for (int i = 0; i <nums.length-1; i++) {

            for (int j = nums.length-1; j >0; j--) {
                if(nums[j]>nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("后:");
        for (int num : nums) {
            System.out.print(num+"\t");
        }
    }
}
