package Pertemuan12;
import java.util.Scanner;
public class AntrianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianMahasiswa queue = new AntrianMahasiswa(5);

        int pilihan;
        do {
            System.out.println("\n==== MENU ANTRIAN LAYANAN KEMAHASISWAAN ====");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble(); sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peekFront();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    queue.printQueue();
                    break;

                case 6:
                    System.out.println("Jumlah antrian saat ini: " + queue.getSize());
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);
    }
}
