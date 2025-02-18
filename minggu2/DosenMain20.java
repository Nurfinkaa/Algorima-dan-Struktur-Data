package minggu2;
public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dsn1 = new Dosen20();
        dsn1.idDosen = "1829";
        dsn1.nama = "Nurfinka";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2019;
        dsn1.bidangkeahlian = "Teknik Informatika";

        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Penidikan");
        dsn1.tampilkanInformasi();

        Dosen20 dsn2 = new Dosen20("2920", "Lailasari", true, 2018, "Teknik Informatika");
        dsn2.tampilkanInformasi();
        
        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Sistem Informasi Bisnis");
        dsn2.tampilkanInformasi();

    }
}
