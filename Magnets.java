 
import java.util.Scanner;


public class Magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d=1,b=0;
  
     int  []a = new int [n];
    
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
               
        }
        
        for(int i=1;i<n;i++)
        {
            int m = a[b];
            if(m==a[i])
            {
                continue;
            }
            else
            {
                d++;
                b=i;
            }
            
               
        }
        System.out.println(d);

      
        
    }
    
}
