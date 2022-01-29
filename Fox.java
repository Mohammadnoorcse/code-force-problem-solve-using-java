
import java.util.Scanner;

public class Fox {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int k = -1;
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print("#");
                }
            } else {
                k++;
                if (k % 2 == 0) {

                    for (int j = 0; j < c - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 0; j < c - 1; j++) {
                        System.out.print(".");
                    }

                }
            }
            System.out.println();
        }
    }

}
