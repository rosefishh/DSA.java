import java.util.*;
public class q19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER NO. OF ROWS:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }

            for(int j=0; j<2*i;j++){
                System.out.print(" ");
            }

            for(int j=n;j>i;j--){
            System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }

            for(int j=0; j<2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=0; j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
