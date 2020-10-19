package 数组;

import java.util.Arrays;


public class Test03 {
    public static void main(String[] args) {
        int[] arr={7,1,5,2};
        int i=0;
        int j=arr.length-1;
        int temp;
        /*while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));*/

        for (int k = 0; k <arr.length-1; k++,j--) {
            temp=arr[k];
            arr[k]=arr[j];
            arr[j]=temp;

        }
        System.out.println(Arrays.toString(arr));



    }


}
