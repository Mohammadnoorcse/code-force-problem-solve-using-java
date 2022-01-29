
import java.util.Scanner;


public class Maximum_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][]a = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= input.nextInt();
            }
        }
        int max = a[0][0];
        if(n==1)
        {
            System.out.println(max);
        }
        else
        {
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
        }
        
        
    }
    
}
