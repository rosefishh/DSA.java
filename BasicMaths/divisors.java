package BasicMaths;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO.:");
        int n = sc.nextInt();

        List<Integer> divisor= new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                divisor.add(i);
            }
        }
        System.out.println(divisor);
    }
}
