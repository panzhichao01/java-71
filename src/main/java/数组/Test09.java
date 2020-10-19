package 数组;

/**
 * 描述:
 * 二分查找算法测试
 *
 * @author Administrator
 * @create 2020-10-16 0:20
 */
public class Test09 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,8,9};
        int num=5;
        int startIndex=0;
        int endIndex=nums.length-1;
        int midIndex=0;
        boolean judge=false;

       do {
           midIndex=(startIndex+endIndex)/2;
           if (num==nums[midIndex]){
               System.out.println("找到");
               judge=true;
               break;
           }else if (nums[midIndex]>num){
               endIndex=midIndex;
           }else {
               startIndex=midIndex;
           }

       }while (startIndex <= endIndex);

       if (!judge){
           System.out.println("找不到");
       }


    }

}