
package A;

import java.util.Scanner;


public class _Minutes {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int  t = input.nextInt();
    int r = 24*60;
    int h,m;
    while(t>0)
    {
        h = input.nextInt();
        m = input.nextInt();
        int result = r-((h*60)+m);
        System.out.println(result);
        t--;
        
    }
    }
   
}
