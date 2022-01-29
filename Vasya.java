
import java.util.Scanner;


public class Vasya {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       if(a>b)
       {
           int r = a-b;
           int s = r/2;
           System.out.println(b+" "+s);
       }
       else
       {
           int r = b-a;
           int s = r/2;
            System.out.println(a+" "+s);
          
       }
       
       
      
    }
    
}
