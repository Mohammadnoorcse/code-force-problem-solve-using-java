
import java.util.Scanner;


public class Translation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t = input.nextLine();
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            r  = r+ s.charAt(i);
        }
        if(r.equals(t))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
            
            
    }
}
