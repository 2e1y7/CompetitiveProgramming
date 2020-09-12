package beginer;

import java.util.*;

public class Otosidama {
    static int number;
    static int sum;
    static int x;//10000
    static int y;//5000
    static int z;//1000
    static int count;
    static int N;

    Otosidama() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sum = sc.nextInt();
        sc.close();
        x = -1;
        y = -1;
        z = -1;
        count = 0;
        N = 2000;
    }

    static void solve() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i; j++) {
                int c = N - i - j;
                if (sum == (i * 10000 + j * 5000 + c * 1000)) {
                    x = i;
                    y = j;
                    z = N - i - j;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        new Otosidama();
        solve();
        System.out.println(x + " " + y + " " + z);
    }
}