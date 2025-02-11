package minggu1;
import java.util.Scanner;
class MataKuliah20 {
    String nama;
    int sks;
    String nilaiHuruf;
    double nilaiSetara;

    public MataKuliah20(String namaMataKuliah, int jumlahSKS, String hurufNilai, double setaraNilai) {
        nama = namaMataKuliah;
        sks = jumlahSKS;
        nilaiHuruf = hurufNilai;
        nilaiSetara = setaraNilai;
    }
}

public class HitungIpSemester20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        
        // Tabel konversi nilai huruf ke bobot nilai
        java.util.Map<String, Double> konversiNilai = new java.util.HashMap<>();
        konversiNilai.put("A", 4.00);
        konversiNilai.put("A-", 3.75);
        konversiNilai.put("B+", 3.50);
        konversiNilai.put("B", 3.00);
        konversiNilai.put("B-", 2.75);
        konversiNilai.put("C+", 2.50);
        konversiNilai.put("C", 2.00);
        konversiNilai.put("D", 1.00);
        konversiNilai.put("E", 0.00);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc20.nextInt();
        sc20.nextLine();

        MataKuliah20[] daftarMK = new MataKuliah20[jumlahMK];
        int totalSKS = 0;
        double totalBobot = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            String nama = sc20.nextLine();
            System.out.print("Jumlah SKS: ");
            int sks = sc20.nextInt();
            sc20.nextLine(); 
            System.out.print("Nilai Huruf (A, B+, C, dll): ");
            String nilaiHuruf = sc20.nextLine().toUpperCase();

            if (!konversiNilai.containsKey(nilaiHuruf)) {
                System.out.println("Nilai tidak valid! Masukkan nilai sesuai tabel konversi.");
                i--; 
                continue;
            }

            double nilaiSetara = konversiNilai.get(nilaiHuruf);
            daftarMK[i] = new MataKuliah20(nama, sks, nilaiHuruf, nilaiSetara); // Memperbaiki instansiasi objek
            totalSKS += sks;
            totalBobot += nilaiSetara * sks;
        }

        double ipSemester = totalBobot / totalSKS;

        // Tampilkan hasil
        System.out.println("\n===============================");
        System.out.printf("%-30s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------");

        for (MataKuliah20 mk : daftarMK) {
            System.out.printf("%-30s %-5d %-10s %-10.2f\n", mk.nama, mk.sks, mk.nilaiHuruf, mk.nilaiSetara);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total SKS: %d\n", totalSKS);
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println("===============================");
        
        sc20.close();
    }
}