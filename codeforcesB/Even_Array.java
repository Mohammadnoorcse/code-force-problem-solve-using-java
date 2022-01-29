package codeforcesB;

import java.util.Scanner;

public class Even_Array {
    void method()
    {
        Scanner input = new Scanner(System.in);
         
            int k = input.nextInt();
                int []a = new int[k];
            for (int j = 0; j < a.length; j++) 
                a[j] = input.nextInt();
            
            int even=0;
            int odd =0;
            int fine =0;
            for(int j=0;j<k;j++)
            {
                if(j%2==0)
                {
                    if(a[j]%2==0)
                    {
                        fine++;
                    }
                    else
                    {
                        even++;
                    }
                }
                else if(j%2==1)
                {
                    if(a[j]%2==1)
                    {
                        fine++;
                    }
                    else
                    {
                        odd++;
                    }
                }
                
            }
            if(fine==k)
            {
                System.out.println(0);
            }
            else if(even==odd)
            {
                System.out.println(even);
            }
            else
            {
                System.out.println(-1);
            }
     
            
        }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Even_Array []t = new Even_Array[n];
        for(int i=0;i<n;i++)
        {
            t[i] = new Even_Array();
            t[i].method();
        }
      
             
     
     
       
    }

}
