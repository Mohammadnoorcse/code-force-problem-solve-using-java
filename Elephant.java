
import java.util.Scanner;


public class Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int c = a/5;
           if(a%5==0)
           {
               System.out.println(c);
           }
           else
           {
              System.out.println(c+1); 
           }
        
        
    }
    
}
