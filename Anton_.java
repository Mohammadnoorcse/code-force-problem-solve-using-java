
import java.util.Arrays;
import java.util.Scanner;

public class Anton_ {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
      
       char[]a =name.toCharArray();
     Arrays.sort(a);
     char []b = new char[a.length];
     int k=0;
    for(int i=0;i<a.length;i++)
    {
        for(int j=97;j<123;j++)
        {
            if(a[i]==j)
            {
                b[k] = a[i];
                k++;
            }
        }
    }
    int c=0;
    for(int i=0;i<k;i++)
    {
        if(b[i]!=b[i+1])
        {
            c++;
        }
    }
        System.out.println(c);

      

    }

}
