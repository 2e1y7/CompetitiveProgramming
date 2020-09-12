package beginer;

import java.util.Scanner;

public class SomeSums {
    static int N;
    //範囲
    static int low, high;
    //各桁の値
    static int a, b;
    static int sum;
    static int ans;

    SomeSums() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        low = sc.nextInt();
        high = sc.nextInt();
        sc.close();
    }

    static void calculate() {
        int num = 0;
        int digitSum = 0;
        for (int i = 1; i <= N; i++) {
            //System.out.println(i);
            num = i;
            digitSum = 0;
            while (true) {
                digitSum = digitSum + num % 10;
                //System.out.println(digitSum);
                num = num / 10;
                if (num == 0) {
                    //System.out.println("!");
                    break;
                }
            }
            if (low <= digitSum && digitSum <= high) {
                ans = ans + i;
            }
        }
    }

    public static void main(String[] args) {
        new SomeSums();
        calculate();
        System.out.println(ans);
        
   } 
}