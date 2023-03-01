import java
import java.util.ArrayList;
import java.util.Scanner;

public class JavaFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        System.out.println("Enter the Number of Rounds:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (Math.random() < 0.5) {
                player1.add("Head");

            } else {
                player1.add("Tail");
            }
        }
        System.out.println("Player1");
        System.out.println("\n" + player1);
        for (int j = 1; j <= a; j++) {
            if (Math.random() < 0.5) {
                player2.add("Head");

            } else {
                player2.add("Tail");
            }
        }
        System.out.println("\n" + "Player2");
        System.out.println("\n" + player2);
        int count1 = 0;
        for (int k = 0; k < a; k++) {
            if (player1.get(k) == "Head") {
                count1++;
            }
        }
        int count2 = 0;
        for (int l = 0; l < a; l++) {
            if (player2.get(l) == "Head") {
                count2++;
            }
        }
        if (count1 < count2) {
            System.out.println("Winner is Player2");
        } else if (count1 == count2) {
            System.out.println("Game is tie");
        } else {
            System.out.println("Winner is Player1");
        }
    }
}