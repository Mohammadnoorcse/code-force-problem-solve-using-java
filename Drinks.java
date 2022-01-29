
import java.util.Scanner;


public class Drinks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a;
        int sum =0;
       
      for(int i=0;i<n;i++)
      {
            a = input.nextInt();
            sum = sum+a;
      }
        double r = (double)(sum)/(double)n;
        System.out.printf("%.12f",r);
        System.out.println();
        
        
    }
    
}
