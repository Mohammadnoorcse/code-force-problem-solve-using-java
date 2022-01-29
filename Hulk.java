
import java.util.Scanner;


public class Hulk {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                 int n = input.nextInt();
                 int a = 0;
                 int c=0;
                 if(n==1)
                 {
                     System.out.println("I hate it");
                 }
                 else{
                     
                 
                for(; ;)
                {
                     
                    c++;
                    n=n-1;
                    if(c==1)
                    {
                        System.out.print("I hate");
                        if(n>=1)
                        {
                            System.out.print(" that ");
                        }
                    }
                    else if(c==2)
                    {
                        System.out.print("I love");
                        c=0;
                        if(n>=1)
                        {
                            System.out.print(" that "); 
                        }
                    }
                
                   if(n<=0)
                    {
                        System.out.println(" it");
                        break;
                    }
                    
                    
                    
                }
                
                 }
    }
    
}
