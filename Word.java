
import java.util.Scanner;


public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char [] a;
        a = s.toCharArray();
        int u=0,l=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=65 && a[i]<=90)
            {
                u++;
            }
            else
            {
                l++;
            }
        }
        if(u>l)
        {
            System.out.println(s.toUpperCase());
        }
        else
        {
            System.out.println(s.toLowerCase());
        }
        
        
        
       
        
    }
    
}
