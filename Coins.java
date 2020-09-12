package beginer;

import java.util.*;
public class Coins {
    static int a;//500
    static int b;//100
    static int c;//50
    static int x;//sum
    static int ans, sum;

    Coins() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        ans = 0;
        sc.close();
    }

    static void test() {
        int sum = 0;
        if (x < 50) {
            return;
        }
        //500
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < b + 1; j++) {
                for (int k = 0; k < c + 1; k++) {
                    sum = i * 500 + j * 100 + k * 50;
                    if (sum == x) {
                        ans++;
                    }
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        new Coins();
        test();
        System.out.println(ans);
    }
}