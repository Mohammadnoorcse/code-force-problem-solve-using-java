
import java.util.Scanner;


public class Beautiful_year {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int a = input.nextInt();
   
    
   int b,c,d,e,f = 0;
   for(; ; )
   {
       
       a++;
          f=a;
       b = f%10;
       c = (f/10)%10;
       d = (f/100)%10;
       e = f/1000;
       if(b!=c &&  b!= d&& b!=e && c!=d && c!=e && d!=e)
       {
           
           break;
       }
       
         
   }
        System.out.println(a);
    }
    
}
