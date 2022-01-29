
import java.util.Scanner;


public class Ultra_fast {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
     String a = input.nextLine();
     String b=input.nextLine();
        
        char d ='0';
 
        
        String c = "";
        for(int i=0;i<a.length();i++)
        {
             if(a.charAt(i)==b.charAt(i))
                {
                    c= c+d;
                }
                else
                {
                    c = c+'1';
                }
            
        }
        System.out.println(c);
    }
}
