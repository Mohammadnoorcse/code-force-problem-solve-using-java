
import java.util.Scanner;

public class love {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
       

        int max = a[0];
        int min = a[0];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                 max = a[i];
                count++;
            }
            if(a[i]<min)
            {
                 min = a[i];
                count++;
            }
            
        }
        System.out.println(count);
        
     

        
    }

}
