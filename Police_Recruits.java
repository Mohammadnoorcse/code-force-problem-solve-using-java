
import java.util.Scanner;

public class Police_Recruits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int p=0;
       int c = 0;
       for(int i=0;i<n;i++)
       {
           int k = input.nextInt();
           if(k>0)
           {
               p = p+k;
           }
           else if(k<0)
           {
               if(p>0)
               {
                   p = p-1;
               }
               else
               {
                   c = c+1;
               }
           }
       }
        System.out.println(c);
    }

}
