
import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        String str = input.nextLine();
     
        String s = str.toUpperCase();
        char[] a = new char[n];
        a = s.toCharArray();

        Arrays.sort(a);
        char[] b = new char[n];
        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                b[k++] = a[i];
              
            }
        }
        b[k++] = a[n-1];
        int c=0;
        
        
        char []m = new char[27];
         int l=0;
         for(char i = 'A';i<='Z';i++)
         {
             m[l] = i;
             l++;
         }
         
         
         
         if(l>k)
         {
             c=1;
             
         }
         else
         {
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(b[i]==m[j])
                {
                   
                    c++;
                   
                }
            }
        }
         }
     
        if (c==l) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
