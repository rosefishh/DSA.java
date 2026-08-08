import java.util.*;
public class q21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("INPUT LENGTH OF EACH SIDE:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}