package Pertemuan12;
public class Mahasiswa {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nim + "\t" + nama + "\t" + kelas + "\t" + ipk);
    }
}
