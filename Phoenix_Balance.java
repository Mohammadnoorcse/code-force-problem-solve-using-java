
import java.util.Arrays;
import java.util.Scanner;

public class Phoenix_Balance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            if (k == 4) {
                int d = (int) Math.pow(2, 1) + (int) Math.pow(2, 4);
                int e = (int) Math.pow(2, 2) + (int) Math.pow(2, 3);
                System.out.println(d - e);
            } else if (k > 4) {
                int[] a = new int[k + 1];
                for (int j = 1; j < k; j++) {
                    a[j] = (int) Math.pow(2, j);
                }
                int[] b = Arrays.copyOfRange(a, (k) / 2, k);
                int[] c = Arrays.copyOfRange(a, 1, (k) / 2);
                int s1 = 0;
                int s2 = (int) Math.pow(2, k);
                for (int j : b) {
                    s1 = s1 + j;
                }

                for (int j : c) {
                    s2 = s2 + j;
                }
                if (s2 > s1) {
                    System.out.println(s2 - s1);
                } else {
                    System.out.println(s1 - s2);
                }

            }
            else
            {
                System.out.println((int)Math.pow(2, 2)-(int)Math.pow(2, 1));
            }

            
        }

    }

}
