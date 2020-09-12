package beginer;


import java.util.*;
public class CardGameForTwo {
    static Integer[] cards;
    static int number;
    static int alice, bob;

    CardGameForTwo() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        cards = new Integer[number];
        alice = 0;
        bob = 0;

        for (int i = 0; i < number; i++) {
            cards[i] = sc.nextInt();
        }
        sc.close();
    }

    static int game() {
        Arrays.sort(cards, Collections.reverseOrder());
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                alice += cards[i];
            } else {
                bob += cards[i];
            }
        }
        return alice - bob;
    }

    public static void main(String[] args) {
        new CardGameForTwo();
        System.out.println(game());
    }
}