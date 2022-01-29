
import java.util.Scanner;

public class Restore_Permutation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int[] a = new int[x * 2];

            for (int j = 0; j < a.length; j++) {
                a[j] = input.nextInt();
            }
            int[] b = new int[a.length];
            int k = 0;

            for (int j = 0; j < a.length - 1; j++) {
                for (int y = j+1; y < a.length; y++) {
                    if (a[j] == a[y]) {
                        b[k] = a[j];
                        k++;
                    }
                }
            }
            for (int j = 0; j < k; j++) {
                System.out.println(b[j]);
            }
        }

    }
}
