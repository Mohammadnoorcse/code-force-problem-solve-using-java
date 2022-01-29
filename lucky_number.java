
import java.util.Scanner;


public class lucky_number {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        long a = input.nextLong();
        int i =0,c=0,r;
        int j=0;
        while(a>0)
        {
           r =  (int) (a%10);
           i++;
           
           if(r==4 || r==7)
           {
               c++;
           }
           
           a = a/10;
            
            
        }
        
        if(c == 4 || c ==7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
            
       
    }
    
}
