package sortingtypes;

import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;

                j--;
            }


        }
        System.out.print("Sorted Array:");
        for (int i :arr) {
            System.out.print(i+" ");
        }

        sc.close();
    }
}
