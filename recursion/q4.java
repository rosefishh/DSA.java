package recursion;
import java.util.*;
public class q4 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(n));
    }
}
