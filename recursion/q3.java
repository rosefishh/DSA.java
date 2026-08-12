package recursion;
import java.util.*;
public class q3 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int sum = 0;
    static void sum(){
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum();
    }
}
