package beginer;

import java.util.*;
public class Product {
    static int numA, numB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();
        if (numA * numB % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}