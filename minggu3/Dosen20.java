package minggu3;
public class Dosen20 {
    private String kode;
    private String nama;
    private Boolean jenisKelamin;
    private int usia;

    public Dosen20(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Dosen     : " + kode);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia + " tahun");
        System.out.println("----------------------------");
    }

    public Boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }
}
