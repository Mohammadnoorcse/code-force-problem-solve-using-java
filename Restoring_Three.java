
import java.util.Scanner;


public class Restoring_Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[4];
        for(int i=0;i<a.length;i++)
        {
            a[i] = input.nextInt();
        }
 

        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
           for(int j = i+1;j<a.length;j++)
           {
               if(a[j]>a[i])
               {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                 
                   
               }
               
           }
           break;
            
        }
        
        int b = a[0]-a[3];
        int c = a[0]-a[2];
        int d = a[0]-a[1];
        System.out.println(b+" "+c+" "+d);
        
        
      
      
        
    }
    
}
