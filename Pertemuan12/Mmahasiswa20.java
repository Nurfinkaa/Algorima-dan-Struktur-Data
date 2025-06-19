package Pertemuan12;
public class Mmahasiswa20 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mmahasiswa20() {
    }

    public Mmahasiswa20(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
