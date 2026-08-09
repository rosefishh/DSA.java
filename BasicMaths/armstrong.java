package BasicMaths;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO.:");
        int n = sc.nextInt();
        
        int temp=n;
        int count=0;
        int sum=0;

        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp =n;

        while(temp>0){
            int last = temp%10;
            sum = sum + (int) Math.pow(last, count);
            temp=temp/10;
        }

        if(sum==n){
            System.out.println("ARMSTRONG NUMBER!");
        }
        else{
            System.out.println("NOT AN ARMSTRONG NUMBER!");
        }
    }
}
