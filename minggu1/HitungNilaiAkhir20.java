package minggu1;
import java.util.Scanner;
public class HitungNilaiAkhir20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");

        // Input Nilai 
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc20.nextDouble();
        System.out.print("Masukkan Nilai Kuiz: ");
        double kuiz = sc20.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc20.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc20.nextDouble();

        // Menghitung Nilai
        if (tugas < 0 || tugas > 100 || kuiz < 0 || kuiz > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("================================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("================================");
        } else {
            double nilaiAkhir = (tugas * 0.20) + (kuiz * 0.20) + (uts * 0.30) + (uas * 0.40);

            // Menentukan Nilai Huruf 
            String nilaiHuruf = "" ;
            if (nilaiAkhir >80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";
            }else if (nilaiAkhir >73 && nilaiAkhir <= 80){
                nilaiHuruf = "B+";
            }else if (nilaiAkhir >65 && nilaiAkhir <= 73){
                nilaiHuruf = "B";
            }else if (nilaiAkhir >60 && nilaiAkhir <= 65){
                nilaiHuruf = "C+";
            }else if (nilaiAkhir >50 && nilaiAkhir <= 60){
                nilaiHuruf = "C";
            }else if (nilaiAkhir >39 && nilaiAkhir <= 50){
                nilaiHuruf = "D";
            }else if (nilaiAkhir <= 39){
                nilaiHuruf = "E"; 
                }

            // Menentukan Status Kelulusan 
            String status = (nilaiAkhir >= 60) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";

            // Menampilkan nilai hasil 
            System.out.println("================================");
            System.out.printf("Nilai Akhir: %.1f%n", nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("================================");
            System.out.println(status);
        }

        sc20.close();
    }
}
