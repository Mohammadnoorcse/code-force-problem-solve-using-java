
import java.util.Scanner;

public class Most_Unstable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            long l = input.nextInt();
            long a = input.nextInt();
            if(l==1)
            {
                System.out.println(0);
            }
            else if(l>2)
            {
                System.out.println(2*a);
            }
            else{
                System.out.println(a);
            }
          
            

        }

    }

}
