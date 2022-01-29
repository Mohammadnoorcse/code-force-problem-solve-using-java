
package A;

import java.util.Scanner;


public class Array_with_Odd_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n>0)  
        {
            int n1 = input.nextInt();
            int a[] = new int[n1];
            for(int i=0;i<n1;i++)
            {
                a[i] = input.nextInt();
                
            }
            int count =0;
            for(int i=0;i<n1;i++)
            {
                if(a[i]%2==1)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("NO");
            }
            else if( n%2==0 && count == n)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
            n--;
        }
        
    }
    
}
