package minggu7;
public class Dosen20 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen20(){
    }

    Dosen20(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Umur :  " + usia);
    }
}
