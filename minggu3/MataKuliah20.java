package minggu3;
import java.util.Scanner;
public class MataKuliah20 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    public MataKuliah20() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahjam = 0;
    }

    public MataKuliah20(String kode, String nama, int sks, int jumlahjam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("Sks         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahjam = Integer.parseInt(sc.nextLine());
        System.out.println("-------------------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahjam);
        System.out.println("-------------------------------------------");
    }
}
