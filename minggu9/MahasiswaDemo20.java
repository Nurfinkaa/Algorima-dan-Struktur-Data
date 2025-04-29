package minggu9;
import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Menghitung Jumlah Tugas yang Sudah Dikirim");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("Stack sudah penuh! Silakan nilai atau hapus tugas sebelum menambahkan tugas baru.");
                    } else {
                        System.out.print("Nama  :  ");
                        String nama = scan.nextLine();
                        System.out.print("NIM   :  ");
                        String nim = scan.nextLine();
                        System.out.print("Kelas :  ");
                        String kelas = scan.nextLine();
                        Mahasiswa20 mhs = new Mahasiswa20(nama, nim, kelas);
                        stack.push(mhs);
                        System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    }
                    break;
                case 2:
                    Mahasiswa20 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa20 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa20 firstStudent = stack.peek();
                    if (firstStudent != null) {
                        System.out.println("Mahasiswa pertama yang mengumpulkan tugas:");
                        System.out.println(firstStudent.nama + "\t" + firstStudent.nim + "\t" + firstStudent.kelas);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    int jumlahTugas = stack.jmlTugas();
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan: %d\n", jumlahTugas);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 5);
        scan.close();
    }
}