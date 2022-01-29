
import java.util.Scanner;

public class Cards_Friends {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            int w = input.nextInt();
            int h = input.nextInt();
            int n = input.nextInt();
            int c = 0;
            if (w % 2 == 0 || h % 2 == 0) {
                while (true) {
                    if (w % 2 == 0) {
                        c++;
                        w = w / 2;
                    } else if (h % 2 == 0) {
                        c++;
                        h = h / 2;
                    } else if (w % 2 == 1 && h % 2 == 1) {
                        break;
                    }
                }

                if (c * 2 >= n) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (n == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }

}
