
import java.util.Scanner;


public class Tram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        int []c = new int[n];
        int i,j=0;
        int sum = 0;
        for(i=1;i<=n;i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            sum = sum-a+b;
            c[j] = sum;
            j++;
            
        }
        int max = c[0];
        for( i=0;i<c.length;i++)
        {
            if(max<c[i])
            {
                max = c[i];
            }
        }
        System.out.println(max);
        
    }
}
