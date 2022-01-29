
import java.util.Scanner;


public class Polyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int sum =0;
        String[]a = new String[n];
        for(int i=0;i<n;i++)
        {
            a[i] = input.nextLine();
        }
        
        
        String []b = {"Tetrahedron","Cube","Octahedron","Dodecahedron","Icosahedron"};
        int []c = {4,6,8,12,20};
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(b[j].equals(a[i]))
                {
                    k=j;
                    
                    sum = sum+c[k];
                }
            }
        }
        System.out.println(sum);
    }
}
