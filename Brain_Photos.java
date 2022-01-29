
import java.util.Scanner;


public class Brain_Photos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c=input.nextInt();
        char[][]a = new char[r][c];
        int i,j;
        for( i=0;i<r;i++)
        {
            for( j =0;j<c;j++)
            {
                a[i][j] = input.next().charAt(0);
            }
        }
        int b =0;
        for( i=0;i<r;i++)
        {
           
            for(j =0;j<c;j++)
            {
                if(a[i][j]=='C'|| a[i][j]=='M' || a[i][j]=='Y')
                {
                    
                    b++;
                    break;
                }
              
            }
            if(b==1)
            {
                break;
            }
        }
        if(b==1)
        {
            System.out.println("#Color");
        }
        else
        {
            System.out.println("#Black&White");
        }
        
    }
}
