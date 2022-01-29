
import java.util.Scanner;


public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        int []c = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<b[i])
            {
                c[i] = b[i]-a[i];
            }
            else if(a[i]%b[i]==0)
            {
                c[i] = 0;
            }
            else
            {
                int r = a[i]/b[i];
                int d = b[i]*(r+1)-a[i];
                
                c[i] = d;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
        
    }
    
}
