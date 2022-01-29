
import java.util.Scanner;


public class Easy_probem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []a = new int[n];
        int d=0,c=0;
        for(int i=0;i<n;i++)
        {
            a[i]= input.nextInt();
            if(a[i]==1)
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        if(c>=1)
        {
            System.out.println("HARD"); 
        }
        else
        {
            System.out.println("EASY");
        }
    }
    
}
