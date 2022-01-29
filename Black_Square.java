
import java.util.Scanner;


public class Black_Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.nextLine();
        String  s1 = input.nextLine();
        char []s = s1.toCharArray();
        int sum =0;
        for(int i=0;i<s1.length();i++)
        {
            switch(s[i])
                    {
                case '1' : sum = sum +a;
                            break;
                case '2' : sum = sum +b;
                            break;
                case '3' : sum = sum +c;
                            break;
                case '4' : sum = sum +d;
                            break;
                        
                    }
        }
        System.out.println(sum);
    }

    
}
