package minggu2;
public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algotitma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilkanInformasi();

        mk1.ubahSKS(2);
        mk1.tambahJam(3);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        MataKuliah20 mk2 = new MataKuliah20("DP", "Dasar Pemrograman", 2, 4);
        mk2.tampilkanInformasi();

        mk2.ubahSKS(2);
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
        mk2.tampilkanInformasi();
    }
}