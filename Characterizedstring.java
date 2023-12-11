import java.util.Scanner;

public class Characterizedstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine();

        uraiKataFormat(input);

        scanner.close();
    }

    private static void uraiKataFormat(String kata) {
        System.out.println("Hasil urai dengan format:");

        for (int i = 0; i < kata.length(); i++) {
            System.out.println("karakter[" + (i + 1) + "]: " + kata.charAt(i));
        }
    }
}