
import java.util.Scanner;


public class Boring_Apartments {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            input.nextLine();
                int sum =10;
          
           
            for(int i=0;i<n;i++)
            {
                String a = input.nextLine();
                char f1 = a.charAt(0);
                 int f = Integer.parseInt(String.valueOf(f1));
                 int l = a.length();
                 int c=0;
                 for(int j=1;j<=l;j++)
                 {
                     c = c+j;
                 }
                
            }
    }
    
}
