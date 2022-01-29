
import java.util.Scanner;


public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       long  n;
        n = input.nextLong();
       
       long a = n/2;
    
        if(n%2==0)
        {
             System.out.println(a); 
        }
        else
        {
              System.out.println(-a-1);
        }
        
      
    }
    
}
