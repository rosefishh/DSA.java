import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS:");
        int n = sc.nextInt();
        int a=0;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i;j++){
                a++;
                System.out.print(a+" ");
                
            }
            System.out.println();
        }
    }
}
