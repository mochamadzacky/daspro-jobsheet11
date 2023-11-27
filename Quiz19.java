
import java.util.Scanner;
import java.util.Random;

public class Quiz19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'Y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (success) {
                    System.out.println("Selamat, Anda benar!");
                } else {
                    System.out.println("Coba lagi.");
                    if (answer < number){
                        System.out.println("Angka yang di masukkan lebih kecil dari jawaban gaes");
                    } else {
                        System.out.println("Angka lebih besar dari jawan gaes");
                    }
                }

            } while (!success);

            System.out.print("Apakah anda ingin mengulang permainan (Y/T)? ");
            menu = input.next().charAt(0);
            input.nextLine();

            if (menu != 'Y' && menu != 'y') {
                break; 
            }

        } while (menu == 'Y' || menu == 'T');

        System.out.println("Terima kasih telah bermain. Sampai jumpa!");
    }
}

