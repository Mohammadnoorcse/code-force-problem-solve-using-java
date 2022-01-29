
import java.util.Scanner;

public class Floor_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
       while(t>0)
       {
           int x = input.nextInt();
           int y = input.nextInt();
           if(x<=2){
               System.out.println(1);
                      
           }
           else{
               int p =x-2;
                int s;
                if(p%y==0)
                {
                    s = p/y;
                }
                else{
                    s = (p/y)+1;
                }
                System.out.println(s+1);
           }
           t--;
       }

    }

}
