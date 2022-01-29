
import java.util.Arrays;
import java.util.Scanner;

public class Meeting_Friends {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[3];

        a[0] = input.nextInt();
        a[1] = input.nextInt();
        a[2] = input.nextInt();
        Arrays.sort(a);
        System.out.println(a[2]-a[0]);

    }

}
