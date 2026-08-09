package BasicMaths;
import java.util.Scanner;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO.:");
        int n = sc.nextInt();

        int rev=0;
        while(n!=0){
            int temp = n%10;
            rev = rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
    }       
}
