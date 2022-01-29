
import java.util.Scanner;


public class Anton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int a =0,d=0;
        for(int i=0;i<n;i++)
        {
          if(s.charAt(i)=='A')
          {
              a++;
          }
          else
          {
              d++;
          }
        }
        if(a==d)
        {
            System.out.println("Friendship");
        }
        else if(a>d)
        {
            System.out.println("Anton");
        }
        else
        {
            System.out.println("Danik");
        }
    }
    
}
