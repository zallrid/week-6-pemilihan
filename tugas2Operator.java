import java.util.Scanner;

public class tugas2Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, C;
        int max,min;

        System.out.print("Masukkan bilangan 1: ");
        A =  sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        C = sc.nextInt();

        if (A >= B && A >= C) {
            max = A;
        } else if (B >= A && B >= C) {
            max = B;
        }
        else {
            max = C;
        }
        // bilangan minimum
        if (A <= B && A <= C) {
            min = A;
        } else if (B <= A && B <= C) {
            min = B;
        }
        else {
            min = C;
        }
        

        System.out.println("Bilangan maksimum: " + max);
        System.out.print("Bilangan minimum: " + min);
    
    }
}
