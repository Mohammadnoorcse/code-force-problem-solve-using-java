
import java.util.Arrays;
import java.util.Scanner;


public class Holiday_Equality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
            
        }
        Arrays.sort(a);
        int sum =0;
        int r;
       for(int i = 0;i<a.length-1;i++)
       {
           if(a[i]<a[a.length-1])
           {
               r = a[a.length-1]-a[i];
               sum = sum +r;
           }
       }
        System.out.println(sum);
        
    }
    
}
