



import java.util.Scanner;

public class Sereja_Dima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();

        }
        int d = 0;
        int s = 0;
        int r = n - 1;
        int l = 0;
        int b = 0;
        while (n > 0) {
            if (b % 2 == 0) {
                if (a[l] > a[r]) {
                    s = s + a[l];

                    l++;
                } else {
                    s = s + a[r];
                    r--;

                }
            } else {
                if (a[l] > a[r]) {
                    d = d + a[l];

                    l++;
                } else {
                    d = d + a[r];
                    r--;

                }
            }
            n--;
            b++;
        }

        System.out.println(s + " " + d);

    }

}
