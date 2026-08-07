import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS:");
        int n = sc.nextInt();

        for(int i=1;i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);   
            }
            
        for(int k=(2*(n-i)); k>=1;k--){
                System.out.print(" ");
            }

            for(int j=i; j>=1;j--){
                System.out.print(j);   
            }
            System.out.println();
        }
    }
}

