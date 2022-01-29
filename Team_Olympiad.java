
import java.util.ArrayList;
import java.util.Scanner;

public class Team_Olympiad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        ArrayList<Integer> name1 = new ArrayList<>();
        ArrayList<Integer> name2 = new ArrayList<>();
        ArrayList<Integer> name3 = new ArrayList<>();
        int p = 0, m = 0, pe = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    p++;
                   
                    name1.add(i+1);
                    break;
                case 2:
                    m++;
                    name2.add(i+1);
                   
                    break;
                case 3:
                    pe++;
                    name3.add(i+1);
                    break;
                default:
                    break;
            }
            if (p > 0 && m > 0 && pe > 0) {
                if (m >= p && pe >=p) {
                    count = p;
                   
                } else if (p >=m && pe >=m) {
                    count = m;
                   

                } else if (m>=pe && p>=pe) {
                    count = pe;
                   
                }
            }

        }
        System.out.println(count);
        for (int j = 0; j < count; j++) {
            System.out.printf("%d %d %d\n", name1.get(j), name2.get(j), name3.get(j));
        }
        name1.clear();
        name2.clear();
        name3.clear();
    }

}
