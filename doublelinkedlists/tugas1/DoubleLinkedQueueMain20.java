package doublelinkedlists.tugas1;
import java.util.Scanner;
public class DoubleLinkedQueueMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists20 antrian = new DoubleLinkedLists20();

        while (true) {
            System.out.println("\n+++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRE VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Antrean: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new PenerimaVaksin(id, nama));
                    break;
                case 2:
                    try {
                        PenerimaVaksin dihapus = antrian.dequeue();
                        System.out.println(dihapus.nama + " telah selesai divaksinasi.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}