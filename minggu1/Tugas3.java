package minggu1;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        //Input matkul
        System.out.print("Masukkan jumlah mata kuliah: ");  
        int jumlahMatkul = sc20.nextInt();
        sc20.nextLine();

        String[] namaMatkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        int[] semester = new int[jumlahMatkul];
        String[] hariKuliah = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata kuliah " + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            namaMatkul[i] = sc20.nextLine();

            System.out.print("SKS: ");
            sks[i] = sc20.nextInt();

            System.out.print("Semester: ");
            semester[i] = sc20.nextInt();

            System.out.print("Hari Kuliah: ");
            sc20.nextLine();
            hariKuliah[i] = sc20.nextLine();
        }

        //menu pilihan
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc20.nextInt();
            sc20.nextLine();
            
            switch (pilihan) {
                case 1:
                    tampilkanJadwal20(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = sc20.nextLine();
                    tampilkanJadwalBerdasarkanHari20(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = sc20.nextInt();
                    tampilkanJadwalBerdasarkanSemester20(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari = sc20.nextLine();
                    cariMataKuliah20(namaMatkul, sks, semester, hariKuliah, namaDicari);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 5);

        sc20.close();
    }


    public static void tampilkanJadwal20(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari20(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean found = false;
        for (int i = 0; i < hariKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester20(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        boolean found = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == sem) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + sem + ".");
        }
    }


    public static void cariMataKuliah20(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String namaDicari) {
        boolean found = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaDicari)) {
                System.out.printf("Mata Kuliah Ditemukan: %s, SKS: %d, Semester: %d, Hari: %s%n", 
                                  namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + namaDicari + " tidak ditemukan.");
        }
    }
}