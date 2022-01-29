
import java.util.Scanner;

public class Required_Remainder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            int l = input.nextInt();
            int m = input.nextInt();

          
              int a = ((m-l)/k)*k+l;
              System.out.println(a);
          
          
        }

    }

}
