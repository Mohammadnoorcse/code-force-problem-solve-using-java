
import java.util.Scanner;

 
public class Buy_Shovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        
        
        
        int i=0;
        while(true)
        {
            i++;
            if(((k*i)%10==0)|| ((k*i-r)%10==0))
            {
                System.out.println(i);
                break;
            }
            
        }
    }
    
}
