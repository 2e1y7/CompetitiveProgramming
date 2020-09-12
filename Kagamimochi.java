package beginer;
import java.util.*;

public class Kagamimochi{
    static int N;
    static int[] size;
    
    static int solve() {
        int count = 0;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        size = new int[N];

        size[count] = sc.nextInt();
        count++;
        for (int i = 1; i < N; i++) {
            check = true;
            size[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (size[j] == size[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        sc.close();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}