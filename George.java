
import java.util.Scanner;


public class George {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c=0;
        int a,b;
        for(int i=0;i<n;i++)
        {
            a = input.nextInt();
            b = input.nextInt();
            if((b-a)>=2)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}