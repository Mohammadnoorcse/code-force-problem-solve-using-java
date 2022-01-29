
import java.util.Scanner;


public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int []a = new int[n];
        for(int i= 0;i<a.length;i++)
        {
            a[i] = input.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]+k <=5)
            {
                sum++;
                if(sum==3)
                {
                    count++;
                    sum=0;
                }
            }
        }
        System.out.println(count);
        
        
    }
    
}
