import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS:");
        int n = sc.nextInt();

        for(int i=0;i<n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            
            char ch= 'A';
            int breakpoint = (2*i+1)/2;

            for(int j=1; j<=(2*i+1);j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
