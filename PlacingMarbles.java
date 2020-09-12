package beginer;

import java.util.*;
public class PlacingMarbles {
    static String src;
    static char[] num;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        src = sc.next();
        num = src.toCharArray();
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (num[i] == '1') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}