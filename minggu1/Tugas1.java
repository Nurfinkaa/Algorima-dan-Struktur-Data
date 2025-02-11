package minggu1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        
        //array
        char kode[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char Kota[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' }, { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' }, { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' }, { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' }, { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' }, { 'T', 'E', 'G', 'A', 'L' }
        };
        Scanner sc = new Scanner(System.in);

        // Input kode plat mobil
        System.out.print("Masukkan kode plat mobil: ");
        char inputKode = sc.next().charAt(0);

        // Mencari nama kota berdasarkan kode plat
        boolean found = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Nama kota untuk kode plat " + inputKode + " adalah: " + kota[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        sc.close();
    }
}