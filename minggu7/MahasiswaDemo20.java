package minggu7;
import java.util.Scanner;
public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();
        
        //menambahkan data secara manual 
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 
        list.listMhs = new Mahasiswa20[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            System.out.println("-------------------------------");
            sc.nextLine(); 
            Mahasiswa20 m = new Mahasiswa20(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();

        
        //mulai dari sini jobsheet6
        //melakukan pencarian data sequential
        System.out.println("-------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearch(posisi, pss);

        //melakukan pencarian data binary
        System.out.println("-------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);


        //mualai ini adalah jobsheet5
        //System.out.println("\nData mahasiswa sebelum sorting:");
        //list.tampil();

        //System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        //list.selectionSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        //list.insertionSort();
        //list.tampil();

        sc.close();
    }
}