package beginer;
import java.util.Scanner;

public class WelcomeToAtCoder {
    static int numA, numB, numC, ans;
    static String name;

    static int calcurate() {
        return numA + numB + numC;
    }

    public static void main(String[] args) {
        new WelcomeToAtCoder();
        Scanner scan = new Scanner(System.in);
        numA = scan.nextInt();
        numB = scan.nextInt();
        numC = scan.nextInt();
        name = scan.next();
        ans = calcurate();

        System.out.println(ans + " " + name);
        scan.close();
    }
}
