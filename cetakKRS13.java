import java.util.Scanner;

public class cetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Akapah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas){
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("SIlahkan cetak KRS dan minta tanda tangan DPA");
            
        }

    }
}
