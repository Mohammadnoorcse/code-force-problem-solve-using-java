package codeforcesB;

import java.util.Arrays;
import java.util.Scanner;

public class Honest_Coach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            int[] a = new int[k];
            for (int j = 0; j < k; j++) {
                a[j] = input.nextInt();
            }
            Arrays.sort(a);
            int c = 0;
            for (int j = 0; j < a.length - 1; j++) {
                for (int l = j + 1; l < a.length; l++) {
                    if (a[j] == a[l]) {
                        c++;
                        break;
                    }

                }
                if(c>0)
                {
                    break;
                }
            }
            if (c > 0) {
                System.out.println(0);
            } else {
                System.out.println(a[1] - a[0]);
            }
        }

    }

}
