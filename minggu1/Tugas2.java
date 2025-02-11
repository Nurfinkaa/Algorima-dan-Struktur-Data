package minggu1;
import java.util.Scanner;
public class Tugas2 {
    
    //fungsi menampilkan menu 
    public static void tampilkanMenu() {
        System.out.println("Menu Perhitungan Kubus");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    //Fungsi mengitung volume kubus 
    public static double hitungVolume (double sisi) {
        return sisi *sisi * sisi ;
    }
        
    //Fungsi menghitung hasil perhitungan luas permukaan kubus
    public static double hitungLuasPermukaan (double sisi) {
        return 6 * (sisi * sisi);
    }

    //Fungsi menghitung hasil perhitungan keliling kubus 
    public static double hitungKeliling (double sisi) {
        return 12 * sisi ;
    }

    //Input nilai 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;

        System.out.print("Masukkan panajang sisi kubus: ");
        sisi = sc.nextDouble();

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();

            switch (pilihan) {
                case   1:
                    double volume = hitungVolume(sisi);
                    System.out.printf("Volume kubus: %.2f\n", volume);
                    break;
            
                case 2:
                double luasPermukaan = hitungLuasPermukaan(sisi);
                System.out.printf("Luas permukaan kubus: %.2f\n", luasPermukaan);
                    break;
                
                    case 3:
                    double keliling = hitungKeliling(sisi);
                    System.out.printf("Keliling kubus: %.2f%n", keliling);
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println();
            
        } while (pilihan != 4);
            }
}