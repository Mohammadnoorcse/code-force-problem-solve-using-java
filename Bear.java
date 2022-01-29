
import java.util.Scanner;


public class Bear {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c= 0;
        while(a<=b)
        {
            c++;
            a = a*3;
            b = b*2;
        }
        System.out.println(c);
    }
    
}
