
import java.util.Scanner;


public class Vanya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int b=0,c=0;
        int []a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=input.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=h)
            {
                b = b+1;
            }
            else
            {
                c = c+2;
            }
        }
        System.out.println(b+c);
    }
}
