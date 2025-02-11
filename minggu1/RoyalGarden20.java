package minggu1;
import java.util.Scanner;
public class RoyalGarden20 {
    // Harga bunga
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;

    // Stok bunga di setiap cabang
    static int[][] stokBunga = {
        {10, 5, 15}, 
        {7, 6, 11},  
        {12, 2, 10},
        {5, 5, 7}  
    };

    // Jumlah stok Mawar di setiap cabang
    static int[] stokMawar = {15, 9, 10, 12}; 

    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        tampilkanPendapatan();

        // Menampilkan jumlah stok setiap jenis bunga
        System.out.println("\nJumlah stok setiap jenis bunga pada cabang RoyalGarden:");
        tampilkanStok();
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang
    public static void tampilkanPendapatan() {
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = (stokBunga[i][0] * HARGA_AGLONEMA) + 
                             (stokBunga[i][1] * HARGA_KELADI) + 
                             (stokBunga[i][2] * HARGA_ALOCASIA) + 
                             (stokMawar[i] * HARGA_MAWAR);
            System.out.printf("%s: Rp. %,d\n", cabang[i], pendapatan);
        }
    }

    // Fungsi untuk menampilkan jumlah stok setiap jenis bunga
    public static void tampilkanStok() {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] totalStok = new int[jenisBunga.length];

        // Menghitung total stok untuk setiap jenis bunga
        for (int i = 0; i < stokBunga.length; i++) {
            totalStok[0] += stokBunga[i][0]; 
            totalStok[1] += stokBunga[i][1]; 
            totalStok[2] += stokBunga[i][2]; 
            totalStok[3] += stokMawar[i];     
        }

        // Menampilkan total stok
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.printf("%s: %d\n", jenisBunga[i], totalStok[i]);
        }
    }
}