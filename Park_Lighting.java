
import java.util.Scanner;


public class Park_Lighting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        for(int i =0;i<n;i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int m = a*b;
            if(m%2==0)
            {
                System.out.println(m/2);
            }
            else
            {
                System.out.println((m/2)+1);
            }
        }
    }
    
}
