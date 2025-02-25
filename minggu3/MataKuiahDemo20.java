package minggu3;
import java.util.Scanner;
public class MataKuiahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        MataKuliah20[] arrayOfMataKuliah20 = new MataKuliah20[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) { 
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah20[i] = new MataKuliah20();
            arrayOfMataKuliah20[i].tambahData(sc);
        }

        for (int i = 0; i < jumlahMataKuliah; i++) { 
            System.out.println("Data MataKuliah ke-" + (i+1));
            if (arrayOfMataKuliah20[i] != null) {
                arrayOfMataKuliah20[i].cetakInfo();
            }
        }
    }
}