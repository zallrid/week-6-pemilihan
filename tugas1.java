import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.println("Masukkan angka: ");
        angka = sc.nextInt();

        if (angka % 2 ==0) {
            System.out.println("Genap");

        }
        else {
            System.out.println("Ganjil");
        }

    }
}
