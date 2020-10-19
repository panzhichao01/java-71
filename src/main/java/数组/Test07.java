package 数组;

/**
 * 描述:
 * 二分查找法
 *
 * @author Administrator
 * @create 2020-10-15 14:49
 */
public class Test07 {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6,7,8,9};
        int searchNum=5;
        int startIndex=0;
        int endIndex=arr.length-1;
        int midIndex=-1;
        boolean flag=false;
        do {
            midIndex=(startIndex+endIndex)/2;
            if (arr[midIndex]==searchNum){
                System.out.println("恭喜您,找到这个数,其下标为:"+midIndex);
                flag=true;
                break;
            }else if (arr[midIndex]>searchNum){
                endIndex=midIndex;

            }else{
                startIndex=midIndex+1;
            }
        }while(startIndex <= endIndex);
        if (!flag){
            System.out.println("很抱歉,没有找到您要找的数字!");
        }


    }

}