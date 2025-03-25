package minggu6;
import java.util.Scanner;
public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 dataDsn = new DataDosen20();
        int pilihan;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
                        System.out.print("Masukkan kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        Boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Masukkan usia dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------------------");

                        Dosen20 dsn = new Dosen20(kode, nama, jenisKelamin, usia);
                        dataDsn.tambah(dsn);
                    }
                    break;
                case 2:
                    dataDsn.tampil();
                    break;
                case 3:
                    dataDsn.sortingASC();
                    System.out.println("Data dosen telah diurutkan secara ascending.");
                    dataDsn.tampil();
                    break;
                case 4:
                    dataDsn.sortingDSC();
                    System.out.println("Data dosen telah diurutkan secara descending.");
                    dataDsn.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
