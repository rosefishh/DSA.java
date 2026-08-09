
import java.util.*;
public class q22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("INPUT LENGTH OF EACH SIDE:");
        int n = sc.nextInt();

        int size = 2*n-1;

        for(int i=0;i<2*n-1;i++){
            for(int j =0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom = (2*n-2)-i;

                int mindist=Math.min(Math.min(top,bottom),Math.min(left,right));

                System.out.print(n-mindist);
            }
            System.out.println();
        }
    }
}