import java.util.Random;
import java.util.Scanner;

public class Noppapeli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Tervetuloa Noppapeliin!");
        System.out.println("Paina Enter heittaaksesi noppaa (q lopettaaksesi).");

        while (true) {
            System.out.print("Paina Enter heittaaksesi noppaa (q lopettaaksesi): ");
            String syote = scanner.nextLine();

            if (syote.equals("q")) {
                break;
            }

            int heitto = random.nextInt(6) + 1; // 1-6 välillä
            System.out.println("Noppa näyttää: " + heitto);
        }

        System.out.println("Kiitos pelaamisesta!");
        scanner.close();
    }
}
