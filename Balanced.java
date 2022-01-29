
import java.util.Scanner;

public class Balanced {

    public static void main(String[] args) {
      
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int s1 =0;
            int s2 =0;
            int k =0;
            for(int i=0;i<n;i++)
            {
                int a = input.nextInt();
                int r = a/2;
                if(r%2==0)
                {
                    System.out.println("YES");
                    for(int j=1;j<=r;j++)
                    {
                        System.out.print(2*j+" ");
                        s1  = s1 +2*j;
                        
                        
                    }
                  
                   for(int j=1;j<=r;j++)
                   {
                       if(j<r)
                       {
                       System.out.print(2*j-1+" ");
                       s2 = s2+ 2*j-1;
                       }
                       else if(j==r)
                       {
                           System.out.println(s1-s2);
                       }
                       
                   }
                   s1 =0;
                   s2= 0;
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }


