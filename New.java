
import java.util.Scanner;


public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int n =240;
        
        int c = n-b;
        int s =0,j=0;
        for(int i=1;i<=a;i++)
        {
            j = j+5*i;
            if(c>=j)
            {
                s++;
                
            }
            else
            {
                break;
            }
        }
        System.out.println(s);
    }
    
}
