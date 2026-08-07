import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS:");
        int n = sc.nextInt();

        for(int i=0;i<n; i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n; i++){
            for(int j=n; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
