package codeforcesB;

import java.util.Scanner;

public class Gifts_Fixing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long t = input.nextLong();
        long s, e, f;
        for (int j = 0; j < t; j++) {
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            long p = (long) 10e9, q = (long) 10e9;
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                if (a[i] < p) {
                    p = a[i];
                }

            }
            for (int i = 0; i < n; i++) {
                b[i] = input.nextInt();
                if (b[i] < q) {
                    q = b[i];
                }

            }

            s = 0;
            for (int i = 0; i < n; i++) {
                
                if ((a[i] > p && b[i] > q ) && (a[i]>0  && b[i]>0)) {
                    e = a[i] - p;
                    f = b[i] - q;
                    if (e <= f) {
                        s = s + e + (f - e);
                    } else {
                        s = s + f + (e - f);
                    }

                } else if (a[i] > p && a[i]>0) {
                    s = s + a[i] - p;
                } else if (b[i] > q && b[i]>0) {
                    s = s + b[i] - q;
                }

            }
            System.out.println(s);
        }

    }

}
