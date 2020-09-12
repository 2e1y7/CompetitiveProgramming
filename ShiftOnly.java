package beginer;

import java.util.*;

public class ShiftOnly {
    static int N, count, flag;
    static int[] num;

    ShiftOnly() {
        N = 0;
        count = 0;
    }
    
    public static void main(String[] args) {
        new ShiftOnly();
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        while (flag == 0) {
            for (int i = 0; i < N; i++) {
                if (num[i] % 2 == 0) {
                    num[i] = num[i] / 2;
                } else {
                    flag = 1;
                }
            }

            if (flag == 0) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}