
import java.util.Arrays;
import java.util.Scanner;

public class Collecting_Coins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int[] a = new int[3];
            for (int j = 0; j < a.length; j++) {
                a[j] = input.nextInt();
            }
            int d = input.nextInt();
            Arrays.sort(a);
           int b = a[2]-a[0];
           int c = a[2]-a[1];
           if(d>=(b+c))
           {
               d = d-(b+c);
               if(d%3==0)
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
           else
           {
               System.out.println("NO");
           }
          

            
        }

    }

}
