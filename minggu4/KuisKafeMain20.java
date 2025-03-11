package minggu4;
import java.util.Scanner;
public class KuisKafeMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah produk yang ingin dibeli: ");
        int jumlahProduk = sc.nextInt();
        sc.nextLine();

        KuisKafe20[] produkKafe = new KuisKafe20[jumlahProduk];

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Masukkan Data Produk ke-" + (i + 1));
            
            System.out.print("Nama Produk: ");
            String namaProduk = sc.nextLine();
 
            System.out.print("Tipe Produk (Hot/Cold): ");
            String typeProduk = sc.nextLine();
            
            System.out.print("Ukuran Produk (Small/Medium/Large): ");
            String sizeProduk = sc.nextLine();
            
            System.out.print("Harga Produk: Rp. ");
            double hargaProduk = sc.nextDouble();
            sc.nextLine();

            System.out.println("----------------------------");

            produkKafe[i] = new KuisKafe20(namaProduk, typeProduk, sizeProduk, hargaProduk);
        }

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Data Produk ke-" + (i + 1));
            if (produkKafe[i] != null) {
                produkKafe[i].informasiProduk();
                System.out.println("-------------------");
            }
        }
    }
}