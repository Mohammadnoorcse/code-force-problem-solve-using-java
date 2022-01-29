

import java.util.Scanner;


public class Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =0;i<n;i++)
        {
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            if(Math.max(x, y)==Math.max(x, z) && Math.max(x, z) ==Math.max(y, z)) {
                System.out.println("YES");
                System.out.println(Math.max(x, y)+" "+Math.min(Math.min(x, y),z)+" "+Math.min(Math.min(x, y),z));
            }
            else
            {
                System.out.println("NO");
            }
            } 
        
    }
    
}
