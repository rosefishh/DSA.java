
import java.util.*;
public class nameheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] h= {2,6,1,9,3};
        String[] n= {"A","B","C","D","E"};

        for(int i=0;i<=h.length-2;i++){
            int max = i;
            for(int j=i;j<=h.length-1;j++){
                if(h[j]>h[max]){
                    max =j;
                }
            }

            int temp = h[max];
            h[max] = h[i];
            h[i] = temp;

            String temp2 = n[max];
            n[max] = n[i];
            n[i] = temp2;
        }
        System.out.println("SORTED NAME:");

        for(String i: n){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("SORTED HEIGHTS:");

        for(int i: h){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
