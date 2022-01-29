
package A;

import java.util.Scanner;


public class Ordinary_Numbers {
    static int function(int number)
            
    {
        int a = number;
      int   s=number%10;
       int n = number/10;
       int c=0;
       while(n>0)
       {
          int r = n%10;
          if (r!=s)
          {
              c++;
              
          }
          n = n/10;
           
       }
       if(c==0)
       {
           return a;
       }
       else{
           return 0;
       }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the any number: ");
        int  n = input.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextInt();
        }
        for(int i =0;i<n-1;i++)
        {
            if(a[i]<=9)
            {
                System.out.println(a[i]);
            }
            else{
                if(function(a[i])>0){
                    System.out.println(function(a[i]));
                }
            }
        }
        
      int  sum=0;
        for(int i=10;i<=a[n-1];i++)
        {
            if(function(i)>0)
            {
                sum++;
            }
            
        }
        System.out.println(sum+9);
      
        
    }
    
}
