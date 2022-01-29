
import java.util.Scanner;


public class Mishka_Game {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int m=0,c=0;
        for(int i=0;i<n;i++)
        {
            int a = input.nextInt();
            int b= input.nextInt();
            if(a>b)
            {
                m++;
            }
            else if(b>a)
            {
                c++;
            }
        }
        if(m>c)
        {
            System.out.println("Mishka");
        }
        else if(c>m)
        {
            System.out.println("Chris");
        }
        else
        {
            System.out.println("Friendship is magic!^^");
        }
    }
    
}
