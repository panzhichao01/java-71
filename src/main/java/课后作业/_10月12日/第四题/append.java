package 课后作业._10月12日.第四题;

public class append {
    public static void main(String[] args) {

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int temp = (int) (Math.random() * 10);
            nums[i] = temp;
        }

        System.out.print("随机数:");
        for (int num : nums) {
            System.out.print(num+"\t");
        }
        System.out.println();
        int index1 = 0;
        int index2 = 10;
        int most = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    num++;
                }
                if (num > index1) {
                    index1 = num;
                    most = nums[j];
                }
            }
            if (num == 1) {
                if (index2 > i) {
                    index2 = i;
                }
            }
            System.out.println((i) + ":出现了" + num + "次");
        }

        System.out.println();
        System.out.println(most + ":出现" + index1 + "次,出现次数最多.");
        System.out.println("出现一次的数字中,最小的是:" + index2);


    }
}
