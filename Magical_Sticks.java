
import java.util.Scanner;

public class Magical_Sticks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       
        for (int i = 0; i < n; i++) {
            int a= input.nextInt();
            if(a%2==0)
            {
                System.out.println(a/2);
            }
            else
            {
                int b =(a-1)/2;
                System.out.println(b+1);
            }
         

    }

}
}
