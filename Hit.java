
import java.util.Scanner;


public class Hit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
      
        int a = n/100;
         
         n = n-a*100;
        
         int b = n/20;
        
          n = n-b*20;
         
          int c = n/10;
        
          n = n-c*10;
          int d = n/5;
         
          n = n-d*5;
        
          System.out.println(a+b+c+d+n);
         
        
    }
    
}
